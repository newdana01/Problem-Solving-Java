// https://school.programmers.co.kr/learn/courses/30/lessons/131128

package jdh;

public class J230706_1 {
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] arrX = findSet(new int[10], X);
        int[] arrY = findSet(new int[10], Y);

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(arrX[i], arrY[i]); j++){
                answer.append(i);
            }
        }

        if ("".equals(answer.toString())) {
            return "-1";
        } else if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer.toString();
        }

    }

    private static int[] findSet(int[] arr, String s){
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 48] += 1;
        }
        return arr;
    }
}
