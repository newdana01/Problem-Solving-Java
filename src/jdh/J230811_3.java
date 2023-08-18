// https://www.acmicpc.net/problem/1940

package jdh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J230811_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        int start = 0, end = N-1;
        int count = 0;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == M) {
                count++;
                end--;
            } else if (sum < M) {
                start++;
            }else {
                end--;
            }
        }

        System.out.println(count);

    }
}
