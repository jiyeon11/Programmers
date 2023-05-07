class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int check = 0; //약수 개수 체크 변수
        
        for(int i = left; i<=right; i++){
            for(int j = 1; j<=i; j++) {
            	if(i%j == 0) check++;  //약수 개수 체크
            }
            if(check%2 == 0) answer += i;  //check가 짝수면
            else answer -= i;
            
            check = 0; //체크 개수 다시 초기화
        }
        
        return answer;
    }
}