public class 최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {
            int maxGaro=0;
            int maxSero=0;
            int wallet=1;
            for (int i=0;i<sizes.length;i++) {
                if (sizes[i][0]< sizes[i][1]) {
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] =temp;
                }
            }



            for (int i=0;i<sizes.length;i++) {
                if (maxGaro< sizes[i][0]) {
                    maxGaro = sizes[i][0];
                }
                if (maxSero< sizes[i][1]) {
                    maxSero = sizes[i][1];
                }
            }

            return maxGaro*maxSero;
        }
    }
}
