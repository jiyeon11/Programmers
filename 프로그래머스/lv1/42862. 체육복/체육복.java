import java.util.*;
class Solution {    //전체 학생의 수//잃은 애 번호//여벌 있는 애 번호
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        //정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //해시맵에 여벌 있는 애 넣어줌
        HashMap<Integer,Integer> re_map = new HashMap<>();
        HashMap<Integer,Integer> lost_map = new HashMap<>();
        
        for(int i = 0; i<reserve.length; i++){
            re_map.put(reserve[i],2);
        }
        //해시맵에 도난 당한 애 넣어줌
        for(int i = 0; i<lost.length; i++){
            lost_map.put(lost[i],0);
        }
        
        //여벌을 가졌지만 도난 당한 애라면 어디에도 속하지 않기 때문에 해시맵에서 지움
        for(int i = 0; i<lost.length; i++){
            if(re_map.containsKey(lost[i])){
                re_map.remove(lost[i]);
                lost_map.remove(lost[i]);
            }
        }
        //잃어버린 애의 앞뒷번호의 애가 여벌이 있다면 잃어버린 애와 빌려준 애 해시맵에서 지움
        for(int i = 0; i<lost.length; i++){
            if(lost[i] == 1){ //lost[i] == 1이면 앞 번호가 존재하지 않음
                if(re_map.containsKey(lost[i]+1)){
                    re_map.remove(lost[i]+1);  //뒷번호 여벌 지움
                    lost_map.remove(lost[i]);  //잃어버린 애 지움
                }
            }else if(i == lost.length){  //i = 끝-1이면 뒷번호가 존재하지 않음
                if(re_map.containsKey(lost[i]-1)){  //앞번호가 여벌을 가지고 있다면
                    re_map.remove(lost[i]-1);  //앞번호 여벌 지움
                    lost_map.remove(lost[i]);  //잃어버린 애 지움
                }
            }else{
                if(re_map.containsKey(lost[i]-1)){  //앞번호가 여벌을 가지고 있다면
                    re_map.remove(lost[i]-1);  //앞번호 여벌 지움
                    lost_map.remove(lost[i]);  //잃어버린 애 지움
                }else if(re_map.containsKey(lost[i]+1)){
                    re_map.remove(lost[i]+1);  //뒷번호 여벌 지움
                    lost_map.remove(lost[i]);  //잃어버린 애 지움
                }
            }
        }
        answer = n-lost_map.size();//전체 학생 수 - 잃어버린 학생 수
        
        return answer;
    }
}