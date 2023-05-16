import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
        //i는 commands[i][0] j는 commands[i][1] k는 commands[i][2]
        int[] arr = null;  //commands[i][0]부터 commands[i][1]까지 array를 자른 값을 넣는 변수
        
        for(int i = 0; i<commands.length; i++){  //3번 돎
            arr = new int[commands[i][1]-commands[i][0]+1];  //commands[i]별 길이 지정
            //j는 2번째 방 값을 넣음
            for(int j = 0; j < arr.length; j++){ //arr에 자른 값을 넣음
                arr[j] = array[(commands[i][0]-1)+j];
            }
            Arrays.sort(arr);  //정렬
            answer[i] = arr[commands[i][2]-1];//commands[i]방에 k번째 값을 넣음
        }
        
        return answer;
    }
}