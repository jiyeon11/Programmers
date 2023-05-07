import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");  //쪼개기
        int num = 0;
        
        if(arr.length%2 == 0){ //arr의 길이가 짝수라면
            num = arr.length/2;
            answer += arr[num-1] + arr[num];
        }else{  //홀수
            num = arr.length/2;
            answer += arr[num];
        }
        return answer;
    }
}