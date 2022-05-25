import java.util.*;
import java.util.*;
public class 기능개발 {
    class Solution {
        public Integer[] solution(int[] progresses, int[] speeds) {
            Stack<Integer> stack = new Stack<>();
            int cnt = 0;//배포된 기능 수
            int day = 1;
            int idx = 0; //스피드 인덱스
            List<Integer> answer = new ArrayList<>();
            for (int i = progresses.length - 1; i >= 0; i--) {
                stack.push(progresses[i]);
            }

            while (!stack.isEmpty()) {
                if (stack.peek() + day * speeds[idx] >= 100) {
                    stack.pop();
                    cnt++;
                    idx++;
                    if (stack.isEmpty()) answer.add(cnt);
                } else {
                    if (cnt != 0)
                        answer.add(cnt);
                    day++;
                    cnt = 0;
                }
            }

            return answer.toArray(new Integer[answer.size()]);
        }
    }
}