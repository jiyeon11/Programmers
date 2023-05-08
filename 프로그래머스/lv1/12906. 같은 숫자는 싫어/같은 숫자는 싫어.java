import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Vector<Integer> v = new Vector<Integer>();
        
        v.add(arr[0]);  //첫번째는 그냥 넣어줌
        for(int i = 1; i<arr.length; i++){  //벡터에 먼저 넣어줌
            if(arr[i-1] != arr[i]){
                v.add(arr[i]);
            }
        }
        answer = new int[v.size()];
        
        for(int i = 0; i<v.size(); i++){ //answer에 벡터 값 넣어줌
            answer[i] = v.get(i);
        }
        return answer;
    }
}