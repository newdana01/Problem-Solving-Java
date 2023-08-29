// https://leetcode.com/problems/implement-queue-using-stacks/

package jdh;

import java.util.*;

public class J230829_2 {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public J230829_2() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack1.isEmpty()){
            stack1.addLast(x);
        }else {
            while(!stack1.isEmpty()){
                int elem = stack1.removeLast();
                stack2.addLast(elem);
            }
            stack1.addLast(x);
            while(!stack2.isEmpty()){
                int elem = stack2.removeLast();
                stack1.addLast(elem);
            }
        }
    }

    public int pop() {
        return stack1.removeLast();
    }

    public int peek() {
        return stack1.peekLast();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */