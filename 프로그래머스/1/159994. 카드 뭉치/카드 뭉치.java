import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> cards1_list = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2_list = new ArrayList<>(Arrays.asList(cards2));
        boolean check = true;
        
        for(int i = 0; i<goal.length; i++){
            if(cards1_list.size() != 0 && cards1_list.get(0).equals(goal[i])){
                cards1_list.remove(0);
            }else if(cards2_list.size() != 0 && cards2_list.get(0).equals(goal[i])){
                cards2_list.remove(0);
            }else{
                check = false;
            }
        }
        
        if(check) return "Yes";
        return "No";
    }
}