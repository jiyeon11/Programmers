import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");  //s 쪼개기
        
        Arrays.sort(arr, Collections.reverseOrder());  //내림차순 정렬
        
        for(int i = 0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}