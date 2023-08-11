// https://www.hackerrank.com/challenges/diagonal-difference/problem

package jdh;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultJ230725_4 {
    static int n, m;
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    private static int sumDigonal(int x, int y, int dx, int dy, List<List<Integer>> arr){
        int nx = x;
        int ny = y;
        int sum = 0;
        while (nx >= 0 && nx < n && ny >= 0 && ny < m){
            sum += arr.get(nx).get(ny);
            nx += dx;
            ny += dy;
        }
        return sum;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        n = arr.size();
        m = arr.get(0).size();

        int leftToRight = sumDigonal(0, 0, 1, 1, arr);
        int rightToLeft = sumDigonal(0, m-1, 1, -1, arr);

        return Math.abs(leftToRight - rightToLeft);
    }

}

public class J230725_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

//        int result = Result.diagonalDifference(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
