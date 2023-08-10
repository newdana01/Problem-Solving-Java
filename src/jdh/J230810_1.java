// https://www.acmicpc.net/problem/11659

package jdh;

import java.util.*;
import java.io.*;

public class J230810_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        int[] sumArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++){
            if (i == 0){
                sumArr[i] = nums[i];
            }else{
                sumArr[i] = sumArr[i-1] + nums[i];
            }
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = 0;

            if (a == 1){
                sum = sumArr[b-1];
            }else{
                sum = sumArr[b-1] - sumArr[a-2];
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }
}