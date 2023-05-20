import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] p_count = p.split("");//p 자릿수를 세기 위한 변수
        String[] t_count = t.split("");//t 자릿수를 세기 위한 변수
        ArrayList<Long> list = new ArrayList<Long>();//p의 길이와 같은 t의 부분 문자열 저장 변수
        
        for(int i = 0; i<t_count.length-(p_count.length-1); i++){
            //p길이로 자른 부분 문자열 int로 바꿔서 list에 넣기
            list.add(Long.valueOf(t.substring(i,i+p_count.length)));
        }
        for(int i = 0; i<list.size(); i++){
            //list.get(i)가 p보다 작거나 같으면 answer++
            //p의 길이가 18자 이하라 int가 아니라 long으로 해줌
            if(list.get(i)<=Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}