import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        answer += str[0].toUpperCase();
        
        for(int i = 1; i<str.length; i++){
            if(str[i-1].equals(" ")){  //공백이라면
                str[i] = str[i].toUpperCase();
            }else{ //아니면 모두 소문자로 바꿈
                str[i] = str[i].toLowerCase();
            }
            answer += str[i];
        }
        return answer;
    }
}