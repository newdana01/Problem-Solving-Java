// https://www.acmicpc.net/problem/10816
package jdh;

import java.io.*;
import java.util.*;

public class J230704_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Map<String, Integer> cards = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            String key = st.nextToken();
            int count = cards.getOrDefault(key, 0);
            cards.put(key, ++count);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            sb.append(cards.getOrDefault(st.nextToken(), 0) + " ");
        }
        System.out.println(sb);
    }
}
