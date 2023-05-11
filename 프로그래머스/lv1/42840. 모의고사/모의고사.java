import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] check = new int[3]; //정답 개수 세는 변수
        //찍는 방식을 담은 배열
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        //수포자들 답을 담는 배열
        int[] su1 = new int[answers.length];
        int[] su2 = new int[answers.length];
        int[] su3 = new int[answers.length];
        
        int j = 0;
        int k = 0;
        int q = 0;
        
        for(int i = 0; i<answers.length; i++){//수포자들 답을 배열에 넣기
            su1[i] = one[j];
            su2[i] = two[k];
            su3[i] = three[q];
            k++; j++; q++;
            
            if(j == one.length) j = 0;
            if(k == two.length) k = 0;
            if(q == three.length) q = 0;
        }
        //정답 횟수 구하기
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == su1[i]){ //su1이 정답이면
                check[0]++;
            }
            if(answers[i] == su2[i]){ //su1이 정답이면
                check[1]++;
            }
            if(answers[i] == su3[i]){  //su3이 정답이면
                check[2]++;
            }
        }
        //제일 많이 맞은거
        int max = Math.max(check[0],check[1]);
        max = Math.max(max,check[2]);
        
        Vector<Integer> v = new Vector<>();
        
        for(int i = 0; i<check.length; i++){
            if(check[i] == max){
                v.add(i+1);
            }
        }
        answer = new int[v.size()];  //배열 생성
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = v.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}