import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계 소문자로 바꾸기
        answer = new_id.toLowerCase();  
        
        //2단계 특수문자 제거
        answer = answer.replaceAll("[^0-9a-z-_.]","");  
        
        //3단계 연속된 마침표 한개로 바꾸기
        while(answer.contains("..")){
            answer = answer.replace("..",".");  
        }
        
        //4단계 처음과 끝에 위치한 마침표 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5단계 answer가 빈 문자열이라면 "a" 대입
        if(answer.equals("")) answer = "a";
        
        //6단계 answer의 길이가 16자 이상이면 15자까지 남기고 다 제거(마침표가 끝에 위치하면 걔도 제거)
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            if(answer.charAt(answer.length()-1) == '.')
                answer = answer.substring(0,14);  //수정해야할듯
        }
        
        //7단계 answer의 길이가 2자 이하면 마지막 문자를 길이가 3이 될 때까지 끝에 붙임
        if(answer.length() <= 2){
            while(answer.length() < 3){
                answer += answer.charAt(answer.length()-1); //끝에 문자 계속 붙임
            }
        }
        return answer;
    }
}