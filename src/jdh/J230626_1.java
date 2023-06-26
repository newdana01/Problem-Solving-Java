package jdh;

public class J230626_1 {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();

        for (int f = 0; f < food.length; f++){
            if (f-1 >= 0){
                String n = Integer.toString(f);
                for (int i = 0; i < food[f] / 2; i++){
                    answer.append(n);
                }
            }
        }
        return answer.toString() + "0" + answer.reverse().toString();
    }
}