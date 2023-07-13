// 행렬 곱 만들기

pakage jdh;

import java.util.*;

public class J230713_1{
  public static void main(String[] args){
    int[][] a = {{3, 2}, {1, 4}};
    int[][] b = {{9, 2}, {1, 7}};
    int[][] answer = new int[2][2];
    
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a.length; j++){
        for (int k = 0; k < a.length; k++){
          answer[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    System.out.println(Arrays.deepToString(answer));
}
