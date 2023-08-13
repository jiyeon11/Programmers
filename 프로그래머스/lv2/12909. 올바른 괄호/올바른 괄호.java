import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        //s의 시작이 '('이 아닐 경우,s의 마지막이 ')'이 아닐 경우, 길이가 짝수가 아닐 경우
        if(s.charAt(0) != '(' || s.charAt(s.length()-1) != ')' || s.length()%2 != 0) 
            return false;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push(s.charAt(i));
            //스택의 마지막과 추가하려는 괄호가 짝지어지면 pop
            else if(!stack.isEmpty() && s.charAt(i) == ')')
                stack.pop();
            else
                return false;
        }
        
        return stack.isEmpty();
        
    }
}