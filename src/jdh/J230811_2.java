// https://www.acmicpc.net/problem/2018
package jdh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J230811_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        int[] sumArr = new int[n+1];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            sumArr[i] += sumArr[i - 1] + i;
            if (sumArr[i] == n) {
                idx = i;
                count++;
            }
        }
        for (int i = idx; i <= n; i++) {
            int j = i-1;
            while (j > 0 && sumArr[i] - sumArr[j] <= n){
                if (sumArr[i] - sumArr[j] == n) {
                    count++;
                    break;
                }
                j--;
            }
        }

        System.out.println(count);

    }
}
