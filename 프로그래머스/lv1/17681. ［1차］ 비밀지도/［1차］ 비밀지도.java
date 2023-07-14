import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //1. 이진수로 바꿈
        //2. 1차원 배열에 넣어줌
        //2.5. 이진수 자릿수 안맞으면 앞에 0추가해줌
        //3. for문 돌려서 같은 인덱스 배열이 1이면 1로 바꿔줌
        //4. for문 돌려서 1이면 #으로, 0이면 빈칸으로 다 바꿔줌
        
        String[] answer = new String[n];
        Arrays.fill(answer, ""); //answer 배열 초기화
        
        String[][] line = new String[2][n];  //0번째 행은 첫번째 지도, 1번 행은 두번째 지도
        
        //이진수로 바꾸기
        for(int i = 0; i<n; i++){
            line[0][i] = String.valueOf(Long.parseLong(Long.toBinaryString(arr1[i])));
            line[1][i] = String.valueOf(Long.parseLong(Long.toBinaryString(arr2[i])));
        }
        
        String temp = ""; //0을 더하기 위한 임시 변수
        
        //이진수의 자리수가 n과 같아야하기 때문에 자리수 맞춰주기
        for(int i = 0; i<2; i++){
            for(int j = 0; j<n; j++){
                if(line[i][j].length() != n){
                    line[i][j] = len(line[i][j],n);  //0을 같이 더해서 새로 저장
                }
            }
        }
        System.out.println(Arrays.toString(line[0]));
        System.out.println(Arrays.toString(line[1]));
        
        //같은 인덱스 배열이 1이면 1로 바꿔줌
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(line[0][i].charAt(j) == line[1][i].charAt(j)){
                    answer[i] += line[0][i].charAt(j);
                }else{  //0과 1로 값이 다름
                    answer[i] += "1";
                }
            }
        }
        
        //0 -> " " | 1 -> "#"
        for(int i = 0; i<answer.length; i++){
            answer[i] = answer[i].replaceAll("0"," ");
            answer[i] = answer[i].replaceAll("1","#");
        }
        
        return answer;
    }
    
    String len(String line, int n){  //암호 길이 맞추기
        String temp;
        temp = "0";
        line = temp + line;
        if(line.length() != n){
            line = len(line,n);
        }
        return line;
    }
}