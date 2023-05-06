class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr_number = phone_number.split("");
        for(int i = 0; i<arr_number.length-4; i++){
            answer += "*";
        }
        for(int i = arr_number.length-4; i<arr_number.length; i++){
            answer += arr_number[i];
        }
        return answer;
    }
}