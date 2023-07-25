// https://leetcode.com/problems/build-array-from-permutation/description/
package jdh;

import java.util.*;

public class J230725_5 {
    public static void main(String[] args) {
        buildArray(new int[] {0,2,1,5,3,4});
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}