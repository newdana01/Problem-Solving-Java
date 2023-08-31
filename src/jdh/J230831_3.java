package jdh;

import java.io.*;
import java.util.*;

public class J230831_3 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] money = new int[n];

        for (int i = 0; i < n; i++){
            money[i] = Integer.parseInt(br.readLine());
        }

        int[] table = new int[m+1];

        Arrays.fill(table, 10001);
        table[0] = 0;

        for (int mon : money){
            for (int j = mon; j <= m; j++){
                if (table[j - mon] != 10001){
                    table[j] = Math.min(table[j], table[j - mon] + 1);
                }
            }
        }

        if (table[m] == 10001) System.out.println(-1);
        else System.out.println(table[m]);
    }


}