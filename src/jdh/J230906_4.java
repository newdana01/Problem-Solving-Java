package jdh;

import java.util.*;

public class J230906_4 {
    public static void main(String[] args) {
        solution(new int[]{10, 9, 4, 5, 12});
        solution(new int[]{6, 4, 2, 11});
    }

    static List<Integer> blacks = Arrays.asList(2, 4, 6, 9, 11);
    static List<Integer> whites = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
    public static int solution(int[] music) {
        int current = 1;
        int move = 0;
        for (int m : music) {
            move += moveTo(current, m);
            current = m;
        }
        return move;
    }

    private static int moveTo(int start, int end) {
        int count = 0;

        int check_start = 0;
        int check_end = 0;

        if (start < end) {
            check_start = start;
            check_end = end;
        }else {
            check_start = end;
            check_end = start;
        }

        for (int i = check_start + 1; i <= check_end; i++) {
            if (blacks.contains(i)) {
                if (i == check_end) {
                    count++;
                }
            }else {
                count ++;
            }
        }

        return count;
    }
}
