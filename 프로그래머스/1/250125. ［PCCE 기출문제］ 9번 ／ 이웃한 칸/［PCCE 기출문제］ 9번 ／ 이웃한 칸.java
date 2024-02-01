class Solution {
    public int solution(String[][] board, int h, int w) {
        int color_count = 0;  //색칠된 칸 개수 저장
        int[] dh = new int[]{0, 1, -1, 0};
        int[] dw = new int[]{1, 0, 0, -1};
        
        for(int i = 0; i < dh.length; i++){
            if(h+dh[i] >= 0 && h+dh[i] < board[0].length && w+dw[i] >= 0 && w+dw[i] < board[0].length){
                if(board[h][w].equals(board[h+dh[i]][w+dw[i]])){
                    color_count++;
                }
            }
        }
        return color_count;
    }
}