// https://leetcode.com/problems/subsets/
package jdh;
import java.util.*;

public class J230615_3 {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayDeque<List<List<Integer>>> stack = new ArrayDeque<>();
        List<List<Integer>> answer = new ArrayList<>();

        stack.addLast(Arrays.asList(Arrays.asList(0), new ArrayList<Integer>()));

        while(!stack.isEmpty()){
            List<List<Integer>> poll = stack.pollLast();
            int level = poll.get(0).get(0);
            if (level == nums.length){
                answer.add(poll.get(1));
                continue;
            }
            List<Integer> num = poll.get(1);
            int n = nums[level];

            stack.addLast(Arrays.asList(Arrays.asList(level+1), new ArrayList<>(num))); // num 자체를 넣어주면 같은 주소값을 가리키기 때문에 값이 계속 추가 됨
            num.add(n);
            stack.addLast(Arrays.asList(Arrays.asList(level+1), new ArrayList<>(num)));
        }
        return answer;
    }
}