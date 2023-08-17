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
        System.out.println("***");
        System.out.println(twoPointer(n));
    }

    static int twoPointer(int n) {
        int start = 1, end = 1;
        int sum = 1;
        int count = 0;

        while (start <= n) {
            if (sum == n) count++;
            if (sum < n) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start ++;
            }
        }

        return count;
    }
}
