package leetcode.链表;

/**
 * @program: DataStructure
 * @description:
 * @author: zhang.cheng
 * @create: 2020-07-04 10:25
 **/

public class ListNode {


    int val;

    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static String getLinkedList(ListNode node) {
        if (node == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        while (node != null) {
            sb.append(node.val + "->");
            node = node.next;
            if (node != null && node.next == null) {
                sb.append(node.val);
                break;
            }
        }

        return sb.toString();
    }
}
