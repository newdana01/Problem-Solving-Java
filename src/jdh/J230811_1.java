// https://www.acmicpc.net/problem/11660

package jdh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J230811_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] table = new int[N+1][N+1];
        int[][] sumArr = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++){
                table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++){
                if (i == 1 && j == 1) {
                    sumArr[i][j] = table[i][j];
                } else if (i == 1) {
                    sumArr[i][j] = sumArr[i][j-1] + table[i][j];
                }else{
                    sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + table[i][j];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = sumArr[x2][y2] - sumArr[x2][y1 - 1] - sumArr[x1 - 1][y2] + sumArr[x1-1][y1-1];
            sb.append(sum).append("\n");

        }

        System.out.println(sb);
    }
}
