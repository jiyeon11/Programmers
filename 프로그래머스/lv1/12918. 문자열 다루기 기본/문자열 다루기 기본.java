import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String[] str_arr = s.split("");  //s길이 구하기 변수
        char[] arr = new char[str_arr.length];
        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i = 0; i<str_arr.length; i++){  //s 쪼개기
            arr[i] = s.charAt(i);
        }
        
        for(int i = 0; i<arr.length; i++){  //문자 있는지 확인
            // for(char j = 'A'; j<'z'; j++){ 
            //     if(arr[i] == j) {
            //         return false;
            //     }
            // }
            for(int j = 0; j<alphabets.length; j++){
                if(str_arr[i].contains(alphabets[j])){
                    return false;
                }
            }
        }
        
        if(arr.length == 4 || arr.length == 6){  //s길이가 4 혹은 6인지 확인
            return true;
        }else{
            return false;
        }
    }
}