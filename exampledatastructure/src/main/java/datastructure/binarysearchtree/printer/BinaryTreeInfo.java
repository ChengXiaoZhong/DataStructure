package datastructure.binarysearchtree.printer;

/**
 * @program: DataStructure
 * @description: 二叉搜索树
 * @author: zhang.cheng
 * @create: 2020-07-06 08:31
 **/


public interface BinaryTreeInfo {

    /**
     * who is the root node
     */
    Object root();
    /**
     * how to get the left child of the node
     */
    Object left(Object node);
    /**
     * how to get the right child of the node
     */
    Object right(Object node);
    /**
     * how to print the node
     */
    Object string(Object node);
}
