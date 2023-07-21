// 주어진 문자열의 문자를 활용해서 연속된 문자가 등장하지 않는 단어를 만들어라. 예시) "abca" -> [abac, abca, acab, acba, baca, caba]
package jdh;

import java.util.*;

public class J230721_1 {
    static String letters;
    static boolean[] visited;
    static List<String> words = new ArrayList<>();


    public static void main(String args[]) {
        String[] answer = solution("abca");
//        System.out.println(Arrays.toString(answer));
    }

    private static String[] solution(String s){
        letters = s;
        visited = new boolean[letters.length()];
        perm(0, new StringBuilder());
        Collections.sort(words, Comparator.naturalOrder());
        return words.toArray(new String[0]);
    }


    private static void perm(int level, StringBuilder sb){
        if (level == letters.length()){
            words.add(sb.toString());
            return;
        }

        for (int i = 0; i < letters.length(); i++){
            if (!visited[i]){
                if (sb.length() != 0 && letters.charAt(i) == sb.charAt(sb.length()-1)){
                    return;
                }
                visited[i] = true;
                sb.append(letters.charAt(i));
                perm(level+1, sb);
                sb.delete(sb.length()-1, sb.length());
                visited[i] = false;
            }
        }
    }
}