// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

package jdh;

import java.util.*;

public class J230823_1 {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (true){
            sb.append(head.val);
            if (head.next == null){
                break;
            }
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}