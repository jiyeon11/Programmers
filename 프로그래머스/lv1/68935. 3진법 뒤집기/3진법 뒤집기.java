class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n,3);  //n을 3진법으로 바꾸기
        
        //앞뒤 반전
        String[] reverse = str.split("");
        String re_str = "";
        
        for(int i = reverse.length-1; i>=0; i--){  //revesrse 원소들을 re_str에 넣음
            re_str += reverse[i];
        }
        answer = Integer.valueOf(re_str,3); //10진수로 바꿈
        return answer;
    }
}