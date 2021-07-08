import java.util.*;

public class 완주하지못한선수_해시 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String,Integer> par = new HashMap<>();
            String answer="";

            for (String i: participant)
                par.put(i,par.getOrDefault(i,0)+1);

            for (int i=0;i<completion.length;i++) {
                par.put(completion[i],par.get(completion[i])-1);
            }

            Iterator<String> iter = par.keySet().iterator();
            while (iter.hasNext()) {
                String key = iter.next();

                if (par.get(key)!=0) {
                    answer=key;
                }

            }


            return answer;
        }
    }
}
