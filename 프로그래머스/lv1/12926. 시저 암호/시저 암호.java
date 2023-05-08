class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] a = s.split("");
        char[] c = new char[a.length];
        for(int i = 0; i<a.length; i++){
            c[i] = s.charAt(i);
        }
        for(int i = 0; i<c.length; i++){
            if(c[i] == ' ') continue;
            
            if(c[i]>'a' && c[i]+n > 'z' || c[i]+n > 'Z' && c[i]<'a') {
        		c[i] -= (char)26;
        	}
            c[i] = (char)((int)c[i]+n);
        }
        for(int i = 0; i<c.length; i++) {
            answer += c[i];
        }
        return answer;  
    }
}