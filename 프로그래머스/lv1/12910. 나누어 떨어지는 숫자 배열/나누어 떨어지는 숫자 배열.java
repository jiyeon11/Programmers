import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Vector<Integer> v = new Vector<Integer>();
        
        for(int i = 0; i<arr.length; i++) {  //나눠지는 것들 거르기
        	if(arr[i]%divisor == 0) {
        		v.add(arr[i]);
        	}
        }
        if(v.size() == 0) {  //element가 하나도 없으면 -1리턴
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        answer = new int[v.size()];
        
        for(int i = 0; i<answer.length; i++) {  //벡터 값 answer에 넣기
        	answer[i] = v.get(i);
        }
        Arrays.sort(answer); //배열 정렬
        return answer;
    }
}