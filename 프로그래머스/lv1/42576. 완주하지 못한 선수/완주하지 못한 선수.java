import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        //완주 못한 선수 찾기
        for(int i = 0; i<completion.length; i++){
            if(participant[i].contains(completion[i])){
                
            }else{
                answer = participant[i];
                break;
            }
        }
        //위에 코드에서 찾지 못했다면 마지막 선수가 완주 못한 거임
        if(answer.equals("")) answer = participant[participant.length-1];
        return answer;
    }
}