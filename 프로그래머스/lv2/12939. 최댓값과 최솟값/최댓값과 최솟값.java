import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = " ";
        String[] num = s.split(" ");  //배열에 쪼개서 넣음
        
        int max = Integer.valueOf(num[0]);  //최대 
        int min = Integer.valueOf(num[0]);  //최소
        
        for(int i = 1; i<num.length; i++){  //최대, 최소값 구하기
            if(Integer.valueOf(num[i])>max) max = Integer.valueOf(num[i]);
            if(Integer.valueOf(num[i])<min) min = Integer.valueOf(num[i]);
        }
        
        answer = min + " " + max;
        return answer;
    }
}