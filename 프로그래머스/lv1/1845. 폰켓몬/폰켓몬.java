import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        
        int get = nums.length/2; //최대로 가질 수 있는 포켓몬 수
        for(int i = 0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                
            }else{
                hash.put(nums[i],nums[i]);
            }
        }
        if(hash.size()>get)
            answer = get;
        else
            answer = hash.size();
        return answer;
    }
}