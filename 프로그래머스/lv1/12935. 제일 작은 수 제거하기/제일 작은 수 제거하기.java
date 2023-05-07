import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int k = 0;
        int cnt = 1;
        
        if(arr.length>1){  //배열 길이가 1보다 크면
            for(int i = 1; i<arr.length; i++){  //제일 작은 수 찾기
            	if(min>arr[i]){
                    min = arr[i];
                }
                // if(min == arr[i-1]) cnt++;
            }//for
            System.out.println(cnt);
            answer = new int[arr.length-cnt];
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == min) {
                	continue;
                }else{
                    answer[k] = arr[i];
                    k++;
                }
                
            }
        }else{ //수를 삭제하면 빈 배열이니 -1 리턴
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}