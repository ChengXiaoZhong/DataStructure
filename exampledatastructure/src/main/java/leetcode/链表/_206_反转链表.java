package leetcode.链表;

/**
 * @program: DataStructure
 * @author: zhang.cheng
 * @create: 2020-07-02 16:05
 **/

public class _206_反转链表 {

    /**
     * 递归
     * eg:5 4 3 2 1
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //传 4 返回来新头 1
        ListNode newHead = reverseList(head.next);
        //举例 当递归回来新头（newHead）为1、头（head）为2时,head.next指向1对应的节点，那么head.next.next即为新头部节点1的next指向
        //所以这里是用新的头部指向上一个节点 如1->2  2->3
        head.next.next = head;
        //将新的头部的下一个节点指向空
        head.next = null;
        return newHead;
    }


    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
}




