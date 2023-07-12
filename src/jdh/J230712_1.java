// https://school.programmers.co.kr/learn/courses/30/lessons/118666
package jdh;
import java.util.*;

public class J230712_1 {
    public String solution(String[] survey, int[] choices) {
        Map<String, int[]> personality = new LinkedHashMap<>();
        personality.put("RT", new int[] {0, 0});
        personality.put("CF", new int[] {0, 0});
        personality.put("JM", new int[] {0, 0});
        personality.put("AN", new int[] {0, 0});

        int[] score = {3, 2, 1, 0, 1, 2, 3};

        for (int i = 0; i < survey.length; i++){
            int s = score[choices[i] - 1];
            String key = survey[i];

            int[] tempScore = personality.getOrDefault(key, null);
            if (tempScore != null){
                if (choices[i] < 4){
                    tempScore[0] += s;
                }else{
                    tempScore[1] += s;
                }
            }
            else{
                char[] temp = key.toCharArray();
                Arrays.sort(temp);
                key = new String(temp);
                tempScore = personality.get(key);

                if (choices[i] > 4){
                    tempScore[0] += s;
                }else{
                    tempScore[1] += s;
                }

            }

        }
        StringBuilder answer = new StringBuilder();
        for (String key : personality.keySet()){
            int[] temp = personality.get(key);
            if (temp[0] >= temp[1]){
                answer.append(key.charAt(0));
            }else {
                answer.append(key.charAt(1));
            }
        }

        return answer.toString();
    }
}