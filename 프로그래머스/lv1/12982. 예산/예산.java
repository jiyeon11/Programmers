import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int i = 0;
        Arrays.sort(d);//정렬
        
        //부서가 한개뿐이면
        if(d.length == 1){
            if(d[i]> budget) //한개뿐인 부서가 예산을 초과해버리면 0리턴
                return 0;
            else
                return 1;
        }
        
        while(true){
            if(budget-d[i] < 0){  //예산에서 다음 신청액을 뺐을때 음수면
                break;
            }
            if(budget-d[i] == 0){  //딱 맞아떨어지면
                answer++;
                break;
            }
	        budget -= d[i++];  //예산에서 신청액 빼기
	        // System.out.println(budget);
	        answer++;
            if(i == d.length){  //부서 다 줘도 남으면
                break;
            }
	    }
        
        return answer;
    }
}