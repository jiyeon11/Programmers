import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int j = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<score.length; i++){
            if(i <= (k-1)){  //k일보다 적다면 그냥 저장
                list.add(score[i]);
            }else{
                if(list.get(0) < score[i]){  //score가 최하위 점수보다 낮다면 저장X
                    list.remove(0);
                    list.add(score[i]);
                }
            }
            Collections.sort(list);  //정렬
            answer[j++] = list.get(0);  //발표 점수 저장
        }
        
        return answer;
    }
}