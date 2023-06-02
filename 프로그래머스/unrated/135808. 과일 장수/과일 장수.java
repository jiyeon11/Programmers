import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        //k는 쓸모가 없음
        //m은 박스에 몇 개 넣는지
        int answer = 0;
        int money = 0;  //이익
        int min = 0;
        Integer[] sc = Arrays.stream(score).boxed().toArray(Integer[]::new); //score 내림차순 정렬을 위한 변수
        Arrays.sort(sc,Collections.reverseOrder());  //내림차순 정렬
        int box_chk = sc.length/m;  //박스 개수
        int chk = 0;
        
        //최저 점수 구하고
        //상자에 담기면 처리함
        for(int i = 0; i<box_chk; i++){  //박수 수만큼 돎
            min = 0;  //최저 점수 초기화
            for(int j = 0; j<m-1; j++){  //최저 점수 구하기
                min = Math.min(sc[chk+j],sc[chk+j+1]);  //최저 구함
            }
            chk += m;
            answer += min*m; //최저점수 X 과일 수
        }
        return answer;
    }
}