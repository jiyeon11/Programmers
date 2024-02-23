import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int j = 0;
        int succeed = 0;  //연속 성공 횟수
        int max_health = health;  //최대 체력
        
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if(attacks[j][0] == i){  //공격 시간 일치 시
                health -= attacks[j][1];
                succeed = 0;  //연속 성공 횟수 초기화
                j++;
            }else{  //성공 시
                if(max_health >= health+bandage[1])  //증가할 체력이 최대 체력보다 낮다면
                    health += bandage[1];  //체력 회복
                else
                    health = max_health;
                succeed++;
                
                if(succeed == bandage[0]){  //연속 성공 시
                    if(max_health >= health+bandage[2])  //증가할 체력이 최대 체력보다 낮다면
                        health += bandage[2];  //추가 회복
                    else
                        health = max_health;
                    succeed = 0;  //연속 성공 횟수 초기화
                }
            }
            
            if(health <= 0) return -1;
        }
        return health;
    }
}