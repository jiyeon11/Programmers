class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count = 0; 
        int y_count = 0;
        String[] arr = s.toLowerCase().split("");  //s를 소문자로 바꾸고 문자열 분리
        
        for(int i = 0; i<arr.length; i++){  //p와y 새수 카운트
            if(arr[i].equals("p"))
                p_count++;
            else if(arr[i].equals("y"))
                y_count++;
        }
        if(p_count == y_count)
            answer = true;
        else if(p_count != y_count)
            answer = false;
        else
            answer = true;
        return answer;
    }
}