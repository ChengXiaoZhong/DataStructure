package leetcode.链表;

/**
 * @program: DataStructure
 * @description:
 * @author: zhang.cheng
 * @create: 2020-07-04 10:34
 **/

public class TestLinkedList {

    public static void main(String[] args) {

        //237 测试
//        ListNode node1 = new ListNode(4);
//
//        ListNode node2 = new ListNode(5);
//        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(9);
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;

//        System.out.println(ListNode.getLinkedList(node1));
//
//        _237_删除链表中的节点.deleteNode(node3);
//
//        System.out.println(ListNode.getLinkedList(node1));


        //206测试

        ListNode node1 = new ListNode(5);

        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(ListNode.getLinkedList(node1));

//        _206_反转链表.reverseList(node1);
        _206_反转链表.reverseList2(node1);

        System.out.println(ListNode.getLinkedList(node5));

    }
}
