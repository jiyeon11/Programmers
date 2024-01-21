import java.util.*;

class Solution {
    public int solution(int n) {
        int len = Integer.bitCount(n);  //1의 개수 세기
        
        int big = n+1;  //n보다 큰 숫자
        
        while(Integer.bitCount(big) != len){  //1의 개수 일치할 때까지 반복
            big++;
        }
        
        return big;
    }
}