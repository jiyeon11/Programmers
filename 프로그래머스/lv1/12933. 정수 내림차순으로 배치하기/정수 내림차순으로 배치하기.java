import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] num = String.valueOf(n).split("");//n을 문자열로 변환하고 쪼개서 넣기
        Arrays.sort(num,Collections.reverseOrder()); //배열 내림차순 정렬
        String str_num = "";
        for(int i = 0; i<num.length; i++) {  //String 변수에 배열값 넣기
        	str_num = str_num.concat(num[i]);
        }
        answer = Long.valueOf(str_num); //answer에 String 값 넣기
        return answer;
    }
}