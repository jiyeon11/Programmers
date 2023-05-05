import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n); //n 문자열로 변환
        
        String[] arr = str.split(""); //문자열 분리해서 배열에 저장
        
        for(int i = 0; i<arr.length; i++){ //문자열을 정수형으로 바꿔 answer에 더함
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}