class Solution {
    public int[] solution(long n) {
        String[] num = String.valueOf(n).split(""); //n 문자열로 변환, 배열에 쪼개서 넣음
        int[] answer = new int[num.length]; //num 배열 길이 써줌
        
        for(int i = 0; i<num.length; i++){ //answer 배열에 num 배열 원소를 거꾸로 넣음
            answer[i] = Integer.valueOf(num[(num.length-1)-i]);
        }
        
        return answer;
    }
}