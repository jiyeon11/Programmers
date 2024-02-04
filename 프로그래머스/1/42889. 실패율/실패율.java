import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] dd = new double[N][2];
        int idx = 0;
        
        for(int i = 1; i<=N; i++){
            dd[idx][0] = i; //스테이지
            dd[idx++][1] = failureRate(i, stages);  //실패율
        }
        
        //정렬
        Arrays.sort(dd, new Comparator<double[]>(){
            @Override
            public int compare(double[] o1, double[] o2){
                return Double.compare(o2[1],o1[1]);
            }
        });
        
        //answer에 저장
        for(int i = 0; i<N; i++){
            answer[i] = (int)dd[i][0];
        }
        
        return answer;
    }
    
    //실패율 구하는 메소드
    double failureRate(int stage, int[] stages){
        double allPlayer = 0;
        double inChallengePlayer = 0;
        
        for(int i = 0; i<stages.length; i++){
            if(stage <= stages[i]){  //클리어, 도전 중인 플레이어 세기
                allPlayer++; 
            }
            if(stage == stages[i]){  //도전 중인 플레이어 세기
                inChallengePlayer++;
            }
        }
        
        if(inChallengePlayer == 0){  //스테이지를 다 통과했다면
            return 0;
        }
        
        return inChallengePlayer/allPlayer;
    }
}