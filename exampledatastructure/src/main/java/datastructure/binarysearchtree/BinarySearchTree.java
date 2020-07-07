package datastructure.binarysearchtree;

import datastructure.binarysearchtree.printer.BinaryTreeInfo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: DataStructure
 * @description: 二叉搜索树
 * @author: zhang.cheng
 * @create: 2020-07-06 08:29
 **/

public class BinarySearchTree<E> implements BinaryTreeInfo {


    private int size;
    private Node<E> root;
    private Comparator<E> comparator;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 添加节点
     *
     * @param element
     */
    public void add(E element) {
        //校验
        elementNotNullCheck(element);

        //看是不是根节点
        if (root == null) {
            root = new Node<>(element, null);
            size++;
            return;
        }

        //不是根节点找到对应父节点
        Node<E> parent = root;
        Node<E> node = root;
        int compareValue = 0;
        do {
            compareValue = compare(element, node.element);
            parent = node;
            //新增元素比父节点大 往右继续比较
            if (compareValue > 0) {
                node = node.right;
            } else if (compareValue < 0) {
                node = node.left;
            } else {
                node.element = element;
                return;
            }


        } while (node != null);

        //看插入到父节点的哪个位子
        Node<E> newNode = new Node<>(element, parent);
        if (compareValue > 0) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
        size++;
    }


    /**
     * 层序遍历
     */
    public void levelOrderTravelsal() {
        if (root == null) {
            return;
        }

        Queue<Node<E>> queue = new LinkedList<>();
        //入队
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node<E> node = queue.poll();
            System.out.println(node.element);

            //左边不为空 入队
            if (node.left != null) {
                queue.offer(node.left);
            }

            //右边不为空 入队
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    /**
     * 节点
     *
     * @param <E>
     */
    private static class Node<E> {
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, Node<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        public boolean isLeaf() {
            return left == null && right == null;
        }

        public boolean hasTwoChildren() {
            return left != null && right != null;
        }
    }

    private void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    /**
     * @return 返回值等于0，代表e1和e2相等；返回值大于0，代表e1大于e2；返回值小于于0，代表e1小于e2
     */
    private int compare(E e1, E e2) {
        if (comparator != null) {
            return comparator.compare(e1, e2);
        }
        return ((Comparable<E>) e1).compareTo(e2);
    }


    @Override
    public Object root() {
        return root;
    }

    @Override
    public Object left(Object node) {
        return ((Node<E>) node).left;
    }

    @Override
    public Object right(Object node) {
        return ((Node<E>) node).right;
    }

    @Override
    public Object string(Object node) {
        Node<E> myNode = (Node<E>) node;
        String parentString = "null";
        if (myNode.parent != null) {
            parentString = myNode.parent.element.toString();
        }
        return myNode.element + "_p(" + parentString + ")";
    }
}
