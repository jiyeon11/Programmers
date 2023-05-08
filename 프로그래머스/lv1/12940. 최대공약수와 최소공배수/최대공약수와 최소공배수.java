class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        
        for(int i = 1; i<=max; i++){  //n과 m이 나눠지는 i가 최대공약수
            if(n%i == 0 && m%i == 0) answer[0] = i;
        }
       
        answer[1] = n*m/answer[0]; //수*수/최대공약수가 최소공배수임
          
        return answer;
    }
}