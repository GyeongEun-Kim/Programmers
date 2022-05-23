import java.util.*;
public class 신규아이디찾기 {

    class Solution {
        public String solution(String new_id) {
            StringBuilder sb = new StringBuilder();
            new_id= new_id.toLowerCase(); //1단계


            for (int i=0;i<new_id.length();i++) {
                Character c = new_id.charAt(i);
                if (c>='a' &&c<='z') sb.append(c.toString());
                else if(c>='0' && c<='9' ) sb.append(c.toString());
                else if (c=='-' || c=='_' ||c=='.') sb.append(c.toString());
            }

            new_id= sb.toString();  //2단계




            //3단계
            while (new_id.contains("..")) {
                new_id=new_id.replace("..",".");
            }


            if (new_id.startsWith("."))
                new_id= new_id.replaceFirst("."," ");
            if (new_id.endsWith("."))
                new_id= new_id.substring(0,new_id.length()-1);
            new_id=new_id.replaceAll(" ",""); //4단계



            if (new_id.equals(""))
                new_id="a"; //5단계


            if(new_id.length()>=16) {
                new_id = new_id.substring(0,15);
                if (new_id.endsWith(".")) {
                    new_id = new_id.substring(0,14);
                }
            }//6단계

            if(new_id.length()<=2){
                Character last = new_id.charAt(new_id.length()-1);
                while(new_id.length()<3) {
                    new_id=new_id+last.toString();
                }
            }//7단계


            return new_id;
        }
    }
}
