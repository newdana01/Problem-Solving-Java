// https://www.acmicpc.net/problem/1931
package jdh;

import java.util.*;
import java.io.*;

public class J230704_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] times = new int[n][2];
        int maxConfer = 0;

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken());
            times[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            else return a[1] - b[1];});

        int compare = 0;

        for (int i = 0; i < n; i++){
            if (compare <= times[i][0]){
                maxConfer++;
                compare = times[i][1];
            }
        }

        System.out.println(maxConfer);
    }
}