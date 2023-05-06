class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);  //int를 String으로 바꾸기
        String[] arr_x = str.split("");  //x 요소 쪼개기
        int[] int_x = new int[arr_x.length]; //arr_x를 int형 배열로 넣기 위한 변수
        
        for(int i = 0; i<int_x.length; i++){  //String을 int로 바꾸기
            int_x[i] = Integer.valueOf(arr_x[i]);  
        }
        int sum = 0;  //자릿수 합
        
        for(int i = 0; i<int_x.length; i++){  //자릿수 더하기
            sum += int_x[i];
        }
        
        if(x%sum == 0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}