// https://school.programmers.co.kr/learn/courses/30/lessons/12909
package jdh;

import java.util.*;
public class J230829_4 {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stack.offer('(');
            }else {
                if (stack.poll() == null){
                    answer = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) answer = false;
        return answer;
    }
}