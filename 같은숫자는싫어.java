import java.util.*;

public class 같은숫자는싫어 {
        public int[] solution(int []arr) {
            int[] answer = new int[arr.length];
            int idx=0;
            Stack<Integer> myStack = new Stack<Integer>();

            for (int i=arr.length-1;i>=0;i--) {
                myStack.push(arr[i]);
                //   System.out.println(myStack.peek());
            }

            answer[idx]= myStack.pop();

            for (int i=0;i<arr.length;i++) {
                if ((!myStack.isEmpty())&&(myStack.peek()!=answer[idx])) {
                    answer[++idx]=myStack.pop();
                }
                else if(!myStack.isEmpty()){
                    myStack.pop();
                }
            }

            return Arrays.copyOfRange(answer,0,idx+1);
        }
    }

