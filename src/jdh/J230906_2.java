package jdh;

public class J230906_2 {
    public static void main(String[] args) {
//        System.out.println(solution(28));
        System.out.println(solution(734));
        System.out.println(solution(1990));
        System.out.println(solution(1000));
    }
    public static int solution(int n){
        int targetDigit = getDigitSum(n);
        int answer = 0;
        while (true){
            if (getDigitSum(++n) == targetDigit){
                answer = n;
                break;
            }
        }

        return answer;
    }

    private static int getDigitSum(int n) {
        int digitSum = 0;
        for (char c: String.valueOf(n).toCharArray()){
            digitSum += Character.getNumericValue(c);
        }

        return digitSum;
    }
}
