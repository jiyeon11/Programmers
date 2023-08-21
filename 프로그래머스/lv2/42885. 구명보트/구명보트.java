import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int right = people.length-1;
        int left = 0;
        
        Arrays.sort(people);  //오름차순으로 정렬
        //right = 큰 몸무게
        //left = 작은 몸무게
        while(left<=right){
            if(people[right]+people[left]<=limit){  //2명이 타는 경우
                left++;
            }
            right--;  //1명이 타는 경우
            answer++;
        }
        //4 5 7 10  13 3
        return answer;
    }
}