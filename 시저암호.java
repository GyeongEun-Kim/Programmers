public class 시저암호 {
    class Solution {
        public String solution(String s, int n) {
            int temp;
            StringBuilder sb = new StringBuilder();

            for (int i=0;i<s.length();i++) {
                if (s.charAt(i) == ' ') {
                    sb.append(s.charAt(i));
                }
                //A=65, a=97, Z=90, z=122
                else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') { //대문자
                    temp = ((int) s.charAt(i)) + n;
                    if (temp > 90)
                        sb.append((char) (temp - 90 + 65 - 1));
                    else
                        sb.append((char) temp);
                } else {//소문자
                    temp = ((int) s.charAt(i)) + n;

                    if (temp > 122)
                        sb.append((char) (temp - 122 + 97 - 1));
                    else
                        sb.append((char) temp);
                }
            }

            return sb.toString();
        }

    }
}
