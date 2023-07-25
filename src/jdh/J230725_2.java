// https://www.acmicpc.net/problem/3273

package jdh;

import java.io.*;
import java.util.*;

public class J230725_2 {
    static int n;
    static int[] nums;
    static int x;
    static Set<Integer> set = new HashSet<>();

    public static void main(String args[]) throws Exception{
        input();
//        twoPointer();
        useSet();
    }

    static void twoPointer(){
        int left = 0, count = 0, right = n-1;

        Arrays.sort(nums);
        while (left < right){
            if (nums[left] + nums[right] == x){
                count++;
                left++;
                right--;
            }else if (nums[left] + nums[right] > x){
                right--;
            }else{
                left++;
            }
        }
        System.out.println(count);
    }

    static void useSet(){ // set을 이용한 방법
        int count = 0;
        for (int n : nums) {
            set.add(n);
        }

        for (int i = 0; i < n; i++) {
            if (set.contains(x - nums[i])) {
                count++;
            }
        }

        System.out.println(count/2);

    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());
    }

}