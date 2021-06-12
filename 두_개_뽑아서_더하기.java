import java.util.*;

public class 두_개_뽑아서_더하기 {
    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[4950];
            //정답을 반환할 배열
            boolean[] check = new boolean[4950];
            //중복을 피하기 위해 answer에 저장돼있는지 체크하는 배열
            int cnt=0;//answer배열에서 slice할 길이
            //(길이가 4950이기 때문에 나머지는 0으로 초기화되기 때문에)
            int idx=0; //answer배열에 넣을때 필요한 인덱스

            for (int i=0;i<numbers.length-1;i++) {
                for (int j=i+1;j<numbers.length;j++) {
                    if (!check[numbers[i]+numbers[j]]) {
                        //check배열이 false이면(=중복이아니면)
                        answer[idx]=numbers[i]+numbers[j];
                        check[answer[idx]]=true;
                        cnt++;
                        idx++;

                    }
                }
            }

            Arrays.sort(answer); //정렬

            return Arrays.copyOfRange(answer,answer.length-cnt,answer.length);
            //그대로 반환하면 [0,0,0...n]으로 반환되기 때문에
            //뒤에서 부터 cnt만큼의 subarray를 반환

        }
    }
}
