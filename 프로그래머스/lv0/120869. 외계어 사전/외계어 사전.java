import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int chk = 0;
        
        for(int i = 0; i<dic.length; i++){
            chk = 0;
            for(int j = 0; j<spell.length; j++){
                if(dic[i].indexOf(spell[j]) == -1){  
                    break;
                }else{
                    chk++;
                }
            }
            if(chk == spell.length) return 1;
        }
        return 2;
    }
}