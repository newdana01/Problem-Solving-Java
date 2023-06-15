// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package jdh;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class J230615_2 {
    static Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );
    static String d;
    static List<String> answer = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        d = digits;
        bt(0, new StringBuilder());
        List<String> res = new ArrayList<>(); // leetcode static 변수 에러 문제로 별도의 반환 변수 생성
        res = answer;
        answer = new ArrayList<>();
        return res;
    }

    private static void bt(int idx, StringBuilder sb){
        if (idx == d.length()){
            if (!sb.toString().equals("")){
                answer.add(sb.toString());
            }
            return;
        }
        char num = d.charAt(idx);
        char[] letters = map.get(num).toCharArray();

        for (char l: letters){
            bt(idx+1, sb.append(l));
            sb.deleteCharAt(sb.length()-1);
        }
    }
}