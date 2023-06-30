// https://www.acmicpc.net/problem/11650
package jdh;

import java.io.*;
import java.util.*;

public class J230630_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] coordinate = new int [n][2];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinate, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            sb.append(coordinate[i][0] + " " + coordinate[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
