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

// 1. 우선순위 큐를 이용한다.
// 2. 우선순위 큐의 원소 개수를 5개로 유지하며 원소 삽입/삭제를 반복한다.
// 3. 큐에 새로 추가될 원소가 peek() 하여 얻은 원소보다 큰 경우에만 삽입/삭제를 실행한다. (작은 경우에는 삽입 후 바로 삭제되므로)
