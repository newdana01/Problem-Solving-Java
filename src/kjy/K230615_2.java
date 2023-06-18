// https://school.programmers.co.kr/learn/courses/30/lessons/159994

package kjy;

public class K230615_2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int indexCards1 = 0;
        int indexCards2 = 0;

        for (int i = 0; i < goal.length; ++i) {
            if (cards1.length > indexCards1 && goal[i].equals(cards1[indexCards1])) {
                indexCards1++;
            } else if (cards2.length > indexCards2 && goal[i].equals(cards2[indexCards2])) {
                indexCards2++;
            } else {
                answer = "No";
                return answer;
            }
        }

        return answer;
    }
}