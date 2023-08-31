package jdh;

import java.io.*;
import java.util.*;

public class J230831_2 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<int[]> q = new ArrayDeque<>();
        boolean[] table = new boolean [n+1];
        q.offer(new int[]{n, 0});
        int answer = 0;

        while (!q.isEmpty()){
            int[] poll = q.poll();
            int x = poll[0];
            int count = poll[1];
            if (x == 1) {answer = count; break;}

            if (x % 5 == 0 && !table[x/5]) {q.offer(new int[]{x/5, count+1}); table[x/5] = true;}
            if (x % 3 == 0 && !table[x/3]) {q.offer(new int[]{x/3, count+1}); table[x/3] = true;}
            if (x % 2 == 0 && !table[x/2]) {q.offer(new int[]{x/2, count+1}); table[x/2] = true;}
            if (x-1 >= 0 && !table[x-1]) {q.offer(new int[]{x-1, count+1}); table[x-1] = true;}
        }
        System.out.println(answer);

    }

    private static void otherSolution(int n) {
        int[] table = new int [30001];

        for (int i = 2; i <= n; i++){
            table[i] = table[i-1] + 1;
            if (i % 2 == 0) table[i] = Math.min(table[i], table[i/2] + 1);
            if (i % 3 == 0) table[i] = Math.min(table[i], table[i/3] + 1);
            if (i % 5 == 0) table[i] = Math.min(table[i], table[i/5] + 1);
        }

        System.out.println(table[n]);
    }


}