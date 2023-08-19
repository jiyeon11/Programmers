import java.util.*;
class Solution{
    public Integer solution(int []A, int []B){
        int answer = 0;
        //각각 오름차순 정렬, 내림차순 정렬을 해서 높은 숫자와 낮은 숫자를 곱해주면 됨
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i<A.length; i++){
            a.add(A[i]);
            b.add(B[i]);
        }
        
        for(int i = 0; i<A.length; i++){
            answer += (a.remove()*b.remove());
        }
        return (Integer)answer;
    }
}