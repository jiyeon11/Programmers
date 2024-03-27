import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        //X와 Y의 숫자(0~9) 빈도수를 저장할 배열
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        //0~9까지 빈도수 구하기
        for(int i = 0; i < X.length(); i++){
            arrX[Character.getNumericValue(X.charAt(i))]++;
        }
        for(int i = 0; i < Y.length(); i++){
            arrY[Character.getNumericValue(Y.charAt(i))]++;
        }
        
        for(int i = 0; i < arrX.length; i++){
            int a = Math.min(arrX[i], arrY[i]);
            for(int j = 0; j < a; j++){
                answer.append(i);
            }
        }
        
        String result = answer.reverse().toString();
        
        if(result.length() == 0) return "-1";
        else if(result.charAt(0) == '0') return "0";
        
        return result;
    }
}