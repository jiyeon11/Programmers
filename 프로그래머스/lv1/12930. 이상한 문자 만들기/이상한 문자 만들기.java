import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] check = s.split("",-1);  //공백 체크용(걍 모두 쪼갠거임)(-1 없어도 잘됨)
        
        int a = 0;
        
        for(int i = 0; i<check.length; i++) {
        	if(check[i].equals(" ")) {  //공백 있으면 더함
        		answer += check[i];
        		a = 0;
        	}else {
        		if(a%2 == 0){  //짝수면 대문자로
        			answer += check[i].toUpperCase();
        		}else{  //홀수면 소문자로
        			answer += check[i].toLowerCase();
        		}
        		a++;
        	}
        }
        return answer;
    }
}