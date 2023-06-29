// https://www.acmicpc.net/problem/1181
package jdh;

import java.util.*;
import java.io.*;

public class J230629_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<String> pq = new PriorityQueue<>(
                Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()));

        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            pq.offer(br.readLine());
        }

        for (int i = 0; i < n; i++){
            String temp = pq.poll();
            if (set.add(temp)){
                System.out.println(temp);
            }
        }
    }
}
// 풀이법 및 Comparator 사용 관련 참고하면 좋은 글: https://st-lab.tistory.com/112