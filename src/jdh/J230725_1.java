// https://www.acmicpc.net/problem/1764

package jdh;

import java.io.*;
import java.util.*;

public class J230725_1 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<String> answers = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n+m; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String key: map.keySet()){
            if (map.get(key) > 1){
                answers.add(key);
            }
        }

        System.out.println(answers.size());

        Collections.sort(answers);
        for (String name: answers){
            System.out.println(name);
        }
    }
}
