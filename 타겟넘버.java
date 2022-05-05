import java.util.*;
public class 타겟넘버 {
    static int [] numbers={1,1,1,1,1};
    static int target=3;
    static Stack<Integer> stack = new Stack();
    static int answer = 0;
    public static void main(String[] args) {
            Arrays.
            dfs(0,0);
            System.out.println(answer);
        }
        public static void dfs(int sum, int idx) {
            stack.push(numbers[idx]);
            if (sum==target) {
                answer++;
                stack.pop();
            }

            if (idx==numbers.length-1) { //리프노드까지 가면
                stack.pop();
                return;
            }
            if (!stack.isEmpty()) {
                if (idx+1 < numbers.length-1) {
                    dfs(sum+numbers[idx],idx+1);
                    dfs(sum-numbers[idx],idx+1);
                    stack.pop();
                }
            }

        }
    }

