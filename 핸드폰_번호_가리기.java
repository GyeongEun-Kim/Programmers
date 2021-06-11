public class 핸드폰_번호_가리기 {
    class Solution {
        public String solution(String phone_number) {
            int star_length = phone_number.length()-4;
            String answer = "";
            for (int i=0;i<star_length;i++) {
                answer=answer+"*";
            }


            for (int i=star_length;i<phone_number.length();i++) {
                answer+=phone_number.charAt(i);
            }

            return answer;
        }
    }
}
