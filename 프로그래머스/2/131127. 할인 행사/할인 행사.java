import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wants = new HashMap<String, Integer>();
        boolean check = false;
        
        for(int i = 0; i<discount.length-9; i++){
            //원하는 제품과 개수 HashMap에 추가
            for(int j = 0; j<want.length; j++){
                wants.put(want[j],number[j]);
            }
            
            //제품이 해당 날에 할인하면 -1 
            for(int j = i; j<10+i; j++){
                if(wants.containsKey(discount[j])){
                    wants.replace(discount[j], wants.get(discount[j])-1);
                }
            }
            
            //HashMap의 value가 모두 0인지 체크
            for(int j = 0; j<wants.size(); j++){
                if(wants.get(want[j]) != 0){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
            if(check) answer++;
        }
        
        return answer;
    }
}