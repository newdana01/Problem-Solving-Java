// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package jdh;

import java.util.*;

public class J230619_1 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int i = score.length - 1;

        while (i - (m-1) >= 0){
            int[] subArr = Arrays.copyOfRange(score, i - (m-1), i+1);
            int minScore = Arrays.stream(subArr).min().getAsInt();
            answer += minScore * m;
            i -= m;
        }
        return answer;
    }
}
