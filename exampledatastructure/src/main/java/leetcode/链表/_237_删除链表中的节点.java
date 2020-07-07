package leetcode.链表;

/**
 * @program: DataStructure
 * @author: zhang.cheng
 * @create: 2020-07-02 14:42
 **/

public class _237_删除链表中的节点 {

    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     * <p>
     * 思路分析：
     * 一般是将前一个节点指向当前节点的下一个节点，但是这里没办法知道上一个节点
     * 所以将当前需要删除的节点的下一个节点覆盖当前节点，然后将当前节点指向下下一个节点，完成删除
     *
     * @param node
     */
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
