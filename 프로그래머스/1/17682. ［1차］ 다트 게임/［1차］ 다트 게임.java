import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int numberIndex = -1;  //숫자 인덱스
        int answer = 0;  //총 점수
        dartResult = dartResult.replace("10", "!");  //10을 느낌표로 미리 바꿔둠
        String[] arr = dartResult.split("");
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("!")) arr[i] = "10";  //느낌표를 10으로 다시 바꿔줌
            
            if(arr[i].matches("^[0-9]*$")){  //숫자일 경우
                list.add(Integer.parseInt(arr[i]));
                numberIndex++;
            }
            else if(arr[i].equals("D")){  //Double: 2제곱
                list.set(numberIndex, (int)Math.pow(list.get(numberIndex), 2));
            }
            else if(arr[i].equals("T")){  //Triple: 3제곱
                list.set(numberIndex, (int)Math.pow(list.get(numberIndex), 3));
            }
            else if(arr[i].equals("*")){  //스타상: 해당 점수와 이전 점수 2배로
                if(list.size()>1){
                    list.set(numberIndex-1, list.get(numberIndex-1) * 2);
                }
                list.set(numberIndex, list.get(numberIndex) * 2);
            }
            else if(arr[i].equals("#")){  //아차상: 해당 점수는 마이너스
                list.set(numberIndex, list.get(numberIndex) * (-1));
            }
        }
        
        //점수 더하기
        for(Integer i : list){
            answer += i;
        }
        return answer;
    }
}