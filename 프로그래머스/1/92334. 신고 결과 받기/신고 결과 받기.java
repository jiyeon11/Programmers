import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> reported = new HashMap<>();  //아이디, 신고당한 횟수
        HashMap<String, String> reportUser = new HashMap<>();  //유저 ID, 신고한 유저ID
        HashMap<String, Integer> user = new HashMap<>();
        
        //report 중복 제거
        HashSet<String> hs = new HashSet<>(Arrays.asList(report));
        report = hs.toArray(new String[0]);
        
        //유저
        for(int i = 0; i<id_list.length; i++){
            user.put(id_list[i], 0);
        }
        
        //신고 처리
        for(int i = 0; i<report.length; i++){
            String[] re = report[i].split(" ");  //re[0]: 유저ID  re[1]: 신고당한 유저ID
            if(reported.containsKey(re[1])){
                reported.replace(re[1], reported.get(re[1])+1);
                reportUser.replace(re[1], reportUser.get(re[1]) +" "+ re[0]);
            }else{
                reported.put(re[1], 1);
                reportUser.put(re[1], re[0]);
            }
        }
        
        //정지 기준 미달 거르기
        for(int i = 0; i<id_list.length; i++){
            if(reported.containsKey(id_list[i]) && reported.get(id_list[i]) < k){
                reported.remove(id_list[i]);
            }
        }
        
        //처리 결과 메일
        int idx = 0;
        for(int i = 0; i<id_list.length; i++){
            if(reported.containsKey(id_list[idx])){
                String[] str = reportUser.get(id_list[idx]).split(" ");
                for(String id : str){
                    user.replace(id, user.get(id)+1);
                }
            }
            idx++;
        }
        
        for(int i = 0; i<id_list.length; i++){
            answer[i] = user.get(id_list[i]);
        }

        return answer;
    }
}