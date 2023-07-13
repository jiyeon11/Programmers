import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Vector<Integer> box = new Vector<>();
        int boxIndex = 0;
        
        //박스에 인형 담기
        for(int i = 0; i<moves.length; i++){
            for(int j = 0; j<board.length; j++){
                if(board[j][moves[i]-1] == 0){ //moves열에 맨 윗 숫자가 0이면
                    continue;
                }else{  //인형이 있으면
                    box.add(board[j][moves[i]-1]);  //박스에 인형을 담아줌
                    board[j][moves[i]-1] = 0;  //인형을 뽑았으니 0으로 바꿔줌
                    break;
                }
            }
        }
        
        //같은 인형 없애기
        for(int i = 1; i < box.size(); i++){
            if(box.get(i-1) == box.get(i)){  //같으면 없애버림
                box.remove(i);
                box.remove(i-1);
                i = 0;
                answer+= 2;
            }
            else if(box.size() == 2 && box.get(i-1) == box.get(i)){  //box가 비면 에러생김
                answer += 2;
                break;
            }
        }

        
        return answer;
    }
}