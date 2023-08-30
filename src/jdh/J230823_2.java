// https://leetcode.com/problems/reverse-linked-list/

package jdh;

import java.util.*;

public class J230823_2 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode n = reverseList(new ListNode(1, node1));
        System.out.println(n.val);
        System.out.println(n.next.val);
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode res = reverseList(head.next);
         head.next.next = head;
         head.next = null;
         return res;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}