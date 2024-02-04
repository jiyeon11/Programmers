class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            answer[i] = s.lastIndexOf(s.charAt(i), i-1);
            if(answer[i] != -1){
                answer[i] = i - answer[i];
            }
        }
        return answer;
    }
}