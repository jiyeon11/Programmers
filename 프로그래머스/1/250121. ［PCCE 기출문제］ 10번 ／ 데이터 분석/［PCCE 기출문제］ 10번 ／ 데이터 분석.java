import java.util.*;

class Solution {
    int sort_index = 0;  //기준이 될 인덱스
    int ext_index = 0;  //뽑아낼 데이터 인덱스
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();

        setIndex(ext, sort_by);
        
        //val_ext보다 작은 데이터만 추출
        for(int i = 0; i<data.length; i++){  
            if(data[i][ext_index] < val_ext){
                list.add(data[i]);
            }
        }
        
        //정렬
        Collections.sort(list, (o1, o2) ->{
            return o1[sort_index] - o2[sort_index];
        });
        
        int[][] answer = new int[list.size()][data[0].length];
        
        //리스트 -> 배열
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    //인덱스 설정 메소드
    void setIndex(String ext, String sort_by){
        switch(ext){
            case "code": ext_index = 0; break;
            case "date": ext_index = 1; break;
            case "maximum": ext_index = 2; break;
            case "remain": ext_index = 3; break;
        }
        
        switch(sort_by){
            case "code": sort_index = 0; break;
            case "date": sort_index = 1; break;
            case "maximum": sort_index = 2; break;
            case "remain": sort_index = 3; break;
        }
    }
}