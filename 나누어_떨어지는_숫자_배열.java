import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = new int[arr.length];
            int idx=0;

            for (int i:arr) {
                if (i%divisor==0) {
                    answer[idx++]=i;
                }
            }
            if (answer[0]==0) {
                answer[0]=-1;
                idx=1;
            }

            answer= Arrays.copyOfRange(answer,0,idx);
            Arrays.sort(answer);
            return answer;
        }
    }
}
