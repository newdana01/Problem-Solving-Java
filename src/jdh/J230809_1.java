// https://school.programmers.co.kr/learn/courses/30/lessons/120884
package jdh;

public class J230809_1 {
    public int solution(int chicken) {
        int answer = 0;
        int N = 10;

        while (chicken / N > 0){
            int service = chicken / N;
            int leftCoupon = chicken % N;

            answer += service;
            chicken = service + leftCoupon;
        }
        return answer;
    }
}