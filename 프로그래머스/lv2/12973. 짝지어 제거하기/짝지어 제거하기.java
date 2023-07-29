import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        
        //stack에 마지막과 push할 것이 같으면 pop한다.
        //다르면 push한다.
        for(int i = 1; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        if(stack.isEmpty()) return 1;  //stack이 비었으면 모두 제거한것이므로 1 리턴
        else return 0;
    }
}