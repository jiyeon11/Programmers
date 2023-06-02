import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(i != j){  //numbers의 인덱스가 같으면 안됨
                    if(map.containsKey(numbers[i]+numbers[j]))  //이미 값이 있으면 continue
                        continue;
                    else
                        map.put(numbers[i]+numbers[j],numbers[i]+numbers[j]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet()); //해시맵 정렬을 위해 리스트로 바꿈
        Collections.sort(list);  //오름차순 정렬
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();//int 배열로 바꿈
        return answer;
    }
}