import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> burger =  Arrays.stream(ingredient).boxed().collect(Collectors.toList());

        for(int i = 0; i < burger.size()-3; i++){
            if(burger.get(i) == 1 && burger.get(i+1) == 2 && burger.get(i+2) == 3 && burger.get(i+3) == 1){
                answer++;
                burger.remove(i);
                burger.remove(i);
                burger.remove(i);
                burger.remove(i);
                if(i>3) i -= 3;
                else i = -1;
            }
        }
        return answer;
    }
}