// https://school.programmers.co.kr/learn/courses/30/lessons/133499
package jdh;

public class J230626_3 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pron = {"aya", "ye", "woo", "ma"};

        for (String b: babbling){
            if (b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")){
                continue;
            }
            for (String p: pron){
                if (b.contains(p)){
                    b = b.replace(p, " ");
                }
            }
            b = b.replace(" ", "");
            if (b.length() == 0){
                answer++;
            }
        }

        return answer;
    }
}