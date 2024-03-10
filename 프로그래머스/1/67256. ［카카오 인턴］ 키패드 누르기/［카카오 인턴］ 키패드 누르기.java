import java.util.*;

class Solution {
    //현재 손가락
    int left_hand = 11;
    int right_hand = 11;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                left_hand = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                right_hand = numbers[i];
            }else{
                answer += middle(String.valueOf(left_hand),String.valueOf(right_hand),String.valueOf(numbers[i]),hand);
                if(answer.charAt(answer.length()-1) == 'L') left_hand = numbers[i];
                else right_hand = numbers[i];
            }
        }
        return answer;
    }
    
    //가운데 키패드 거리 구하기 (왼손 위치, 오른손 위치, 눌러야 할 숫자, 손잡이)
    String middle(String left, String right, String number, String hand){
        int left_r = 0;
        int left_c = 0;
        int right_r = 0;
        int right_c = 0;
        int number_r = 0;
        int number_c = 0;
        int dis1 = 0;
        int dis2 = 0;
        String h = "";
        String[][] keypad = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"11","0","11"}};
        
        for(int i = 0; i < keypad.length; i++){
            for(int j = 0; j < keypad[i].length; j++){
                if(keypad[i][j].equals(left)){
                    left_r = i;
                    left_c = j;
                }
                if(keypad[i][j].equals(right)){
                    right_r = i;
                    right_c = j;
                }
                if(keypad[i][j].equals(number)){
                    number_r = i;
                    number_c = j;
                }
            }
        }
        dis1 = Math.abs(number_r-right_r)+Math.abs(number_c-right_c);
        dis2 = Math.abs(number_r-left_r)+Math.abs(number_c-left_c);
        
        //왼손과 오른손의 거리가 같다면
        if(dis1 == dis2){
            if(hand.equals("right")) h = "R";
            else h = "L";
        }else if(dis1 > dis2){
            h = "L";
        }else if(dis1 < dis2){
            h = "R";
        }
        return h;
    }
}