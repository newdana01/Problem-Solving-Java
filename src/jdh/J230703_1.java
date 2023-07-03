// https://www.acmicpc.net/problem/10814
package jdh;

import java.util.*;
import java.io.*;

public class J230703_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (a, b) -> {
            int tempA = Integer.parseInt(a[0]);
            int tempB = Integer.parseInt(b[0]);
            if (tempA == tempB) return 0;
            else return tempA - tempB;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}