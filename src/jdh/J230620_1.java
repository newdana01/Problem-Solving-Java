// https://leetcode.com/problems/permutations/description/
package jdh;

import java.util.*;

public class J230620_1 {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> selectedNums = new ArrayList<>();
        bt(0, selectedNums, nums);
        return answer;
    }

    public void bt(int level, List<Integer> selectedNums, int[] nums){
        if (level == nums.length){
            answer.add(new ArrayList<>(selectedNums));
            return;
        }

        for (int n: nums){
            if (selectedNums.indexOf(n) == -1){
                selectedNums.add(n);
                bt(level+1, selectedNums, nums);
                selectedNums.remove(selectedNums.size() - 1);
            }
        }
    }
}