// https://www.acmicpc.net/problem/2003
package jdh;

import java.io.*;
import java.util.StringTokenizer;

public class J230818_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        int count = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0;
        int sum = 0;

        while (start < N && end < N) {
            if (sum == M) {
                count ++;
            }
            if (sum < M) {
                sum += nums[end];
                end++;
            }else {
                sum -= nums[start];
                start++;
            }
        }

        System.out.println(count);

    }
}
