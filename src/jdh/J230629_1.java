// https://www.acmicpc.net/problem/2075
package jdh;

import java.util.*;
import java.io.*;

public class J230629_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            pq.offer(temp);
        }

        for (int i = 1; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                int temp = Integer.parseInt(st.nextToken());
                if (pq.peek() < temp){
                    pq.offer(temp);
                    pq.poll();
                }
            }
        }

        System.out.println(pq.poll());

    }
}
