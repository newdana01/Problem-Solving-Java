package jdh;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J230831_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[] dirX = {1, 1, 1};
        int[] dirY = {-1, 0, 1};

        for (int i = 0 ; i < t; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] golds = new int[n][m];
            int[] goldSum = new int[m+1];

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++){
                for (int k = 0; k < m; k++) {
                    golds[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int x = 0, y = 0;
            int currentX = -1; int currentY = 1;

            for (int j = 1; j <= m; j++){
                x = currentX; y = currentY;
                int maxGold = 0;
                for (int d = 0; d < 3; d++){
                    int dx = dirX[d] + x;
                    int dy = dirY[d] + y;

                    if (dx < m && dy >= 0 && dy < n && dx >= 0 && golds[dy][dx] > maxGold){
                        maxGold = golds[dy][dx];
                        currentX = dx;
                        currentY = dy;
                    }
                }
                goldSum[j] = goldSum[j-1] + maxGold;
            }

            sb.append(goldSum[m]).append("\n");
        }
        System.out.println(sb);
    }
}
