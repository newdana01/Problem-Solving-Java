// https://school.programmers.co.kr/learn/courses/30/lessons/176963

package kjy;

import java.util.*;

class K230615_1 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> nameScoreMap = new HashMap<>();

        if (name.length == yearning.length) {
            for (int index = 0; index < name.length; index ++) {
                nameScoreMap.put(name[index], yearning[index]);
            }

            // System.out.println(nameScoreMap);

            for (int i = 0; i < photo.length; i ++) {
                Integer tempScore = 0;

                for (int j = 0; j < photo[i].length; j++) {
                    String nameToSearch = photo[i][j];

                    if (nameScoreMap.containsKey(nameToSearch)) {
                        tempScore += nameScoreMap.get(nameToSearch);
                    }

                    answer[i] = tempScore;
                }
            }
        }
        return answer;
    }
}