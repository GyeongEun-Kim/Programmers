public class _2016년 {
    class Solution {
        public String solution(int a, int b) {
            String[] date ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
            int[] days = {0,31,29,31,30,31,30,31,31,30,31,30};
            int daySum =5; //1월1일이 금요일이라서

            for (int i=0;i<a;i++) {
                daySum+=days[i];
            } //월 더하기

            daySum+=b-1; //일 더하기

            daySum%=7;

            return date[daySum];
        }
    }
}
