package stack;

import java.util.Stack;

public class kakao1 {
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int cur = 0;
        Stack<Integer> bag = new Stack<>();
        
        for(int i=0; i<moves.length; i++) {
        	for(int j=0; j<board.length; j++) {
        		cur = board[j][moves[i] - 1];
        		
        		if(cur > 0) {
        			if(!bag.isEmpty() && bag.peek() == cur) {
        				bag.pop();
        				answer = answer + 2;
        			} 
        			else {
        				bag.add(cur);
        			}
        			board[j][moves[i] - 1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String args[]) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
}
