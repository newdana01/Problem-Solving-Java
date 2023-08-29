// https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java

package jdh;

import java.util.*;

public class J230829_3 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int n = progresses.length;
        int[] leftDays = new int[n];

        for (int i = 0; i < n; i++){
            leftDays[i] = (int) Math.ceil((double)(100 - progresses[i]) / (double)speeds[i]);
        }

        int deploy = leftDays[0];
        int count = 1;
        for (int i = 1; i < n ; i++){
            if (leftDays[i] > deploy){
                deploy = leftDays[i];
                answer.add(count);
                count = 1;
            }else {
                count++;
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(x -> x).toArray();
    }
}