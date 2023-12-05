import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Vector<String> already = new Vector<String>();  //말한 단어를 저장하는 벡터
        int count = 1;  //순서
        already.add(words[0]);
        for(int i = 0; i<words.length-1; i++){
            //마지막 글자와 첫 글자가 같고 벡터에 저장이 안되어 있다면
            if(words[i].charAt(words[i].length()-1) == words[i+1].charAt(0) && !already.contains(words[i+1])){
                System.out.println("ㄱㅊ아 : " + words[i+1]);
                already.add(words[i+1]);
                count++;
            }else{
                System.out.println("잘못됨 : " + words[i+1]);
                break;
            }
        }
        
        if(count == words.length){  //탈락자가 없으면
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = count%n+1;  //번호
            answer[1] = count/n+1;  //차례
        }
        return answer;
    }
}