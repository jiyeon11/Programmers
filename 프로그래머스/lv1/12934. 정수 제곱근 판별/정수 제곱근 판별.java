class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long sqrt = (long)Math.sqrt(n);  //제곱근 구하기
//         String sqrtTOstr = String.valueOf(sqrt);  //제곱근 문자열로 변환
//         sqrtTOstr = sqrtTOstr.replace(".","!");  //소수점을 느낌표로 바꿔줌(왜 점이 안되는진 모르겠음)
//         String[] s = sqrtTOstr.split("!");  //느낌표을 기준으로 분리
//         String[] count = s[0].split("");  //s[0] 자리수 카운트를 위해 문자열 분리
        
//         if(sqrtTOstr.charAt(count.length+1) == '0'){
//             answer = (long)Math.pow(sqrt+1,2);  //x+1 제곱
//         }else{
//             answer = -1;
//         }
         if(n == sqrt*sqrt) {
         	answer = (long)Math.pow(sqrt+1,2);
         }else {
         	answer = -1;
         }
        return answer;
    }
}