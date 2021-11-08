import java.util.*;
public class 크레인인형뽑기게임 {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack();
            for (int i=0;i<moves.length;i++) {
                int move = moves[i]-1;

                for (int j=0;j<board[0].length;j++) {
                    if(board[j][move] != 0) {
                        if (stack.isEmpty() || stack.peek()!= board[j][move]) {
                            stack.push(board[j][move]);
                        }
                        else {
                            System.out.println(stack.peek()+" "+board[j][move]);
                            stack.pop();
                            answer+=2;
                        }
                        board[j][move] =0;
                        break;
                    }
                }

            }
            return answer;
        }
    }
}
