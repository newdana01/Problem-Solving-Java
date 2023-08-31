package jdh;

import java.io.*;
import java.util.*;

public class J230831_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] foods = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i ++){
            foods[i] = Integer.parseInt(st.nextToken());
        }

        int[] table = new int[n];

        table[0] = foods[0];
        table[1] = Math.max(table[0], foods[1]);

        for (int i = 2; i < n; i++){
            table[i] = Math.max(table[i-1], table[i-2]+foods[i]);
        }

        System.out.println(table[n-1]);

    }
}
