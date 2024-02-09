import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String temp = "";
        HashMap<String,Integer> map = new HashMap<>();  //이름, 순위
        
        for(int i = 0; i < players.length; i++){  
            map.put(players[i],i+1);
        }
        
        for(int i = 0; i < callings.length; i++){
            temp = players[map.get(callings[i])-2];
            players[map.get(callings[i])-2] = players[map.get(callings[i])-1];
            players[map.get(callings[i])-1] = temp;
            map.put(callings[i], map.get(callings[i])-1);  //추월함
            map.put(temp, map.get(temp)+1);  //추월당함
        }
        return players;
    }
 
}