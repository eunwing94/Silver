package test05_03;
// 한번더 해보기~~~~~~~~~~~~~~~@@@@@@@@@@@@@@@@@@@
// 05-03. 카카오 인형뽑기

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
  
public class Main {
	
	public int solution(int input1, int input2, int[][] board, int[] move) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		int count = 0;
		
		int old_peek=0;
		int new_peek=0;
		for(int x=0;x<input2;x++){	// 8개
			
			// 기존 peek
			if(stack.isEmpty()) {					
				old_peek = 0;	
			}else {
				old_peek = stack.peek();	// 기존 peek
			}
			for(int y=0;y<input1;y++) {	// 5개
				if(board[y][move[x]-1] != 0) {	// 0이 아닐때.. push
					stack.push(board[y][move[x]-1]);
					new_peek = board[y][move[x]-1];
					board[y][move[x]-1] = 0;	// push 후 기존 것 0으로 대체해주기
					
					break;	// 0 아닌 순간 push하고 break
					
				}else {	// 신규가 0일 경우..
					new_peek = 0;
				}
			}
		
			if(new_peek == old_peek && old_peek!=0 && new_peek!=0 ) {
				stack.pop();
				stack.pop();
				count++;
				count++;
			}

		}
		answer = count;
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		
		//ArrayList<Integer> board = new ArrayList<>();
		int[][] board = new int[input1][input1];
		
		
		for(int i=0;i<input1;i++) {
			for(int j=0;j<input1;j++) {
				board[i][j] = in.nextInt();
			}
		}
		int input2 = in.nextInt();
		int[] move = new int[input2];

		for(int k=0;k<input2;k++) {
			move[k] = in.nextInt();
		}
		System.out.print(T.solution(input1,input2,board,move));

	}
}

