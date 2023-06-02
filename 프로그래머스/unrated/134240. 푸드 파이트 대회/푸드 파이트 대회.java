import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //반쪽 먼저 저장
        for(int i = 1; i<food.length; i++){
            if(food[i] %2 != 0) food[i] -= 1;  //음식의 양이 홀수면 1개 버림
            for(int j = 0; j<food[i]/2; j++){
                list.add((i));
            }
        }
        list.add(0);  //음식 배치의 중간은 무조건 0임
        
        //나머지 반쪽 더 붙여줌
        for(int i = list.size()-2; i>=0; i--){  
            list.add(list.get(i));
        }
        
        //String으로 바꿔서 answer에 저장
        for(int i = 0; i<list.size(); i++){
            answer += String.valueOf(list.get(i));
        }
        
        return answer;
    }
}