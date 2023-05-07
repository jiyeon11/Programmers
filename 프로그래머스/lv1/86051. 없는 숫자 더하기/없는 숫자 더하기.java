import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] check = {0,1,2,3,4,5,6,7,8,9};
        int j = 0;
        Arrays.sort(numbers); //정렬
        
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i] + " vs " + check[j]);
            if(numbers[i] != check[j]){
                answer += check[j];
                System.out.println(check[j] + "더함");
                i--;
            }
            j++;
    	}
        if(numbers.length < check.length) {  //남은거 더해주기
        	for(int i = numbers[numbers.length-1]+1; i<check.length; i++) {
        		System.out.println(check[i] + "더함");
        		answer += check[i];
        	}
        }
        return answer;
    }
}