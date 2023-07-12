// https://school.programmers.co.kr/learn/courses/30/lessons/118666
package jdh;
import java.util.*;

public class J230712_1 {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        char [][] type = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int [] score = {0, 3, 2, 1, 0, 1, 2, 3};
        Map<Character, Integer> point = new HashMap<>();

        for (char[] t : type){
            point.put(t[0], 0);
            point.put(t[1], 0);
        }

        for (int i = 0; i < survey.length; i++){
            if (score[choices[i]] > 4) {
                point.put(survey[i].charAt(1), point.get(survey[i].charAt(1) + score[choices[i]]));
            } else {
                point.put(survey[i].charAt(1), point.get(survey[i].charAt(1) + score[choices[i]]));
            }
        }

        for (char[] t : type){
            char temp = (point.get(t[1]) <= point.get(t[0])? t[0] : t[1]);
            answer.append(temp);
        }

        return answer.toString();
    }
}