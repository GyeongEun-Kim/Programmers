import java.util.Arrays;

public class 예산 {
    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);
            for (int i=0;i<d.length;i++) {
                if (budget<=0) break;
                else if (budget-d[i]<0) break;
                budget-=d[i];
                answer++;
            }
            return answer;
        }
    }
}
