// https://school.programmers.co.kr/learn/courses/30/lessons/140108

package kjy;

public class K230619_1 {
    public int solution(String s) {
        int answer = 0;
        char tempFirstChar = s.charAt(0);
        int sameChar = 0;
        int diffChar = 0;

        for (int i = 0; i < s.length(); i++) {
            if (tempFirstChar == ' ') {
                tempFirstChar = s.charAt(i);
            }

            if (tempFirstChar == s.charAt(i)) {
                sameChar++;
            } else {
                diffChar++;
            }

            if (sameChar == diffChar) {
                answer++;
                tempFirstChar = ' ';
                sameChar = 0;
                diffChar = 0;
            }
        }

        if (sameChar != 0) {
            answer++;
        }

        return answer = (answer == 0) ? 1 : answer;
    }
}