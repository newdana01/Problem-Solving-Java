// https://school.programmers.co.kr/learn/courses/30/lessons/132267
package jdh;

public class J230626_4 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int left = 0;
        int cola = 0;
        while (n >= a){
            cola = (n / a) * b;
            left = (n % a);
            n = left + cola;
            answer += cola;
        }
        return answer;
    }
}