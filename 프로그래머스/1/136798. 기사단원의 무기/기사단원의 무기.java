import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;  //약수 개수 카운트 변수
        
        for(int i = 1; i <=number; i++){
            cnt = 0;
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){  //작은 수
                    cnt++;
                    if(i / j != j){  //큰 수
                        cnt++;
                    }
                }
            }
            
            if(cnt>limit) answer += power;
            else answer += cnt;
        }
        return answer;
    }
}