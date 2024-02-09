import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int same_count = 1;  //같은 글자 세기
        int diff_count = 0;  //다른 글자 세기
        Vector<String> vector = new Vector<>();  //분해한 문자열 넣을 벡터
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(0) == s.charAt(i)){
                same_count++;
            }else{
                diff_count++;
            }
            if(same_count == diff_count){
                vector.add(s.substring(0,i+1));  //벡터에 분해한 거 저장
                s = s.substring(i+1);  //글자 분해
                //초기화
                same_count = 1;
                diff_count = 0;
                i = 0;
            }
            
        }
        if(!s.equals("")) vector.add(s);  //남은 글자가 있다면 벡터에 저장
        answer = vector.size();
        
        return answer;
    }
}