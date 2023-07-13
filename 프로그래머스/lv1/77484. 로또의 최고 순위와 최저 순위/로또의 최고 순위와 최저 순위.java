class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int check = 0;
        int correct = 7;  //맞음
        int wrong = 1;  //틀림
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){  //로또번호가 0이면
                wrong ++;
                correct--;
                System.out.println(lottos[i] + ": 0임. 맞기도하고틀리기도함");
                continue;
            }
            for(int j = 0; j<lottos.length; j++){
                if(lottos[i] == win_nums[j]){
                    System.out.println(lottos[i] + ": 맞음");
                    correct--;
                    break;
                }else{
                    check++;
                }
            }
            if(check == 6){
                wrong++;  //맞은게 하나도 없을때
                System.out.println(lottos[i] + ": 틀림");
            } 
            check = 0;
        }
        if(wrong == 7) wrong = 6;
        if(correct == 7) correct = 6;
        answer[0] = correct;
        answer[1] = wrong;
        
        return answer;
    }
}