import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] category = {"RT","CF","JM","AN"};
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < category.length; i++){
            map.put(category[i].charAt(0), 0);
            map.put(category[i].charAt(1), 0);
        }
        
        //점수 계산
        for(int i = 0; i < survey.length; i++){
            if(choices[i]<4){  //비동의쪽
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0))+scoreReplace(choices[i]));
            }else if(choices[i]>4){  //동의쪽
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+choices[i]-4);
            }
        }
        
        //유형 진단
        for(int i = 0; i < category.length; i++){
            if(map.get(category[i].charAt(0)) >= map.get(category[i].charAt(1))){
                answer += String.valueOf(category[i].charAt(0));
            }else{
                answer += String.valueOf(category[i].charAt(1));
            }
        }
        return answer;
    }
    
    //점수 변환
    int scoreReplace(int choices){
        if(choices == 3) return 1;
        else if(choices == 2) return 2;
        else return 3;
    }
}