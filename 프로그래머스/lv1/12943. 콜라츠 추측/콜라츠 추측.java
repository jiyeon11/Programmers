class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;  //num이 작업을 반복하면 수가 커져 오버플로우 발생함
        
        if(n == 1){ //num이 1이면 0 리턴 
            return 0;
        }
        
        do{
            if(n%2 == 0){  //num이 짝수면
                n /= 2;  //2 나누기
                answer ++;
            }else{  //num이 홀수면
                n = (n*3) +1;  //3 곱하기 1 더하기
                answer ++;
            }
            if(answer>500){  //작업이 500번이 넘으면 -1
                answer = -1;
                break;
            }
        }while(n != 1);
        
        return answer;
    }
}