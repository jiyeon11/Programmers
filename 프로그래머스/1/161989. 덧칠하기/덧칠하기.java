import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int n, int m, int[] section) {
        //첫 구역은 먼저 페인트칠함.
        int answer = 1;
        int index = section[0];
        
        for(int i : section){
            if(i < index+m){
                continue;
            }
            answer++;
            index = i;
        }
        
        return answer;
    }
}