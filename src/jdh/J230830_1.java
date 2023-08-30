// https://leetcode.com/problems/add-two-numbers/solutions/3675747/beats-100-c-java-python-beginner-friendly/

package jdh;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.math.*;

public class J230830_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger val1 = getValue(l1, new BigInteger("1"), new BigInteger("0"));
        BigInteger val2 = getValue(l2, new BigInteger("1"), new BigInteger("0"));

        ListNode answer = makeListNode(String.valueOf(val1.add(val2)));

        return answer;
    }

    private static BigInteger getValue(ListNode node, BigInteger digit, BigInteger val){
        ListNode head = node;

        while (true){
            val = val.add(digit.multiply(BigInteger.valueOf(head.val)));
            digit = digit.multiply(BigInteger.valueOf(10));
            if (head.next == null){
                break;
            }
            head = head.next;
        }
        return val;
    }

    private static ListNode makeListNode(String s){
        if (s.length() == 1){
            int num = Character.getNumericValue(s.charAt(s.length() - 1));
            return new ListNode(num);
        }
        int val = Character.getNumericValue(s.charAt(s.length() - 1));
        ListNode next = makeListNode(s.substring(0, s.length()-1));
        return new ListNode(val, next);
    }
}
