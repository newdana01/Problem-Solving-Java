// https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/

package jdh;

import java.util.*;

public class J230829_1 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for (int i = 1; i < prefixSum.length; i++){
            prefixSum[i] += prefixSum[i-1] + nums[i];
        }

        for (int q: queries){
            int i = binarySearch(prefixSum, q);
            if (i < 0){
                answer.add((i * - 1) - 1);
            }else{
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

    private static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low + high) >> 1;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else if (arr[mid] > target){
                high = mid - 1;
            }
        }

        return - (low + 1);
    }
}