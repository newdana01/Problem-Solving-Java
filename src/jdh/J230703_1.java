// https://www.acmicpc.net/problem/10814
package jdh;

import java.util.*;
import java.io.*;
import java.lang.StringBuilder;

public class J230703_1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        StringBuilder[] people = new StringBuilder[200];

        for (int i = 0; i < people.length; i++) {
            people[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[age].append(age).append(" ").append(name).append("\n");
        }
        StringBuilder sb = new StringBuilder();

        for (StringBuilder p : people) {
            sb.append(p);
        }
        System.out.println(sb);
    }
}