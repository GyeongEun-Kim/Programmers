import java.util.*;

public class 완주하지못한선수 {
    class Solution {
        public String solution(String[] participant, String[] completion){
            Arrays.sort(participant);
            Arrays.sort(completion);
            String temp="";


            for (int i=0;i<completion.length;i++) {
                if (!participant[i].equals(completion[i])) {
                    temp=participant[i];
                    break;
                }
            }
            if (temp.equals(""))
                temp=participant[participant.length-1];

            return temp;
        }
    }
}
