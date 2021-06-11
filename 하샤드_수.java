public class 하샤드_수 {
    class Solution {
        public boolean solution(int x) {
            String n = Integer.toString(x);
            int sum=0;
            boolean answer = false;

            for (int i=0;i<n.length();i++) {
                sum+=n.charAt(i)-'0';
            }

            if(x%sum==0)
                answer=true;

            return answer;
        }
    }
}
