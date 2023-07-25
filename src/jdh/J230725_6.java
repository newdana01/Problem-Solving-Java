// https://leetcode.com/problems/left-and-right-sum-differences/description/

package jdh;

import java.util.*;

public class J230725_6 {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++){
            leftSum[i] = getSum(Arrays.copyOfRange(nums, 0, i));
            rightSum[i] = getSum(Arrays.copyOfRange(nums, i+1, n));
        }

        for (int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }

    private int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}