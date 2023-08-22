import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i<=n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    
    boolean isPrime(int num){
        int a = (int)Math.sqrt(num);
        for(int i = 2; i<=a; i++){
            if(num != i && num%i == 0) return false;
        }
        return true;
    }
}