import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();  //개발이 끝난 일수를 저장 
        int cnt = 1;
        Vector<Integer> dsb = new Vector<>();  //배포 날짜 저장 벡터
        
        //개발이 끝나는 날짜 스택에 저장 
        for(int i = 0; i < speeds.length; i++){
            stack.push(day(progresses[i],speeds[i]));
        }
        
        int key = stack.get(0);  //스택에 0번째 키값으로 설정
        
        //배포 날짜 벡터에 저장
        for(int i = 1; i<stack.size(); i++){
            if(key<stack.get(i)){
                dsb.add(cnt);
                cnt = 1;  //초기화
                key = stack.get(i);
            }else{
                cnt++; 
            }
        }
        dsb.add(cnt);  //마지막 저장
        
        answer = new int[dsb.size()];
        
        for(int i = 0; i<dsb.size(); i++){  //answer에 저장
            answer[i] = dsb.get(i);
        }
        return answer;
    }
    
    //날짜 계산 메서드
    public int day(int progress,int speed){
        int d = 0;
        while(progress<100){
            progress+=speed;
            d++;
        }
        return d;
    }
}