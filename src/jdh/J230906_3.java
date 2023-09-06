package jdh;

public class J230906_3 {
    public static void main(String[] args) {
////        System.out.println(solution(new int[]{1, 1, 2, 3, 3}, 3));
////        System.out.println(solution(new int[]{1, 1, 3}, 2));
////        System.out.println(solution(new int[]{1, 2, 2}, 5));
////        System.out.println(solution(new int[]{1, 2, 5}, 5));
////        System.out.println(solution(new int[]{1, 2, 5, 5}, 5));
//        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 5));
    }

    public static boolean solution(int[] A, int k){
        int n = A.length;
        for (int i = 0; i < n-1; i++){
            if(A[i]+1 < A[i+1]){
                return false;
            }
        }

        if (A[0] != 1 || A[n-1] != k){
            return false;
        }else {
            return true;
        }
    }
}
