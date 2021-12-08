package test07_08;
// 07-08. 송아지 찾기 1. BFS 상태트리탐색 // 한번더하기

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
  
public class Main {

	public int solution(int input1, int input2) {
		int result = 0;
		int[] dic = {1, -1, 5};
		Queue<Integer> Q = new LinkedList<>();
		int[] point = new int[10001];	// 왜 10001일까..
		int cnt = 0;
		int newPoint = 0;
		point[input1] = 1;	// START
		Q.offer(input1);
		
		while(!Q.isEmpty()) {
			int qlen = Q.size();
			for(int k=0;k<qlen;k++) {
				System.out.println(Q);
				int x = Q.poll();
				
				for(int d = 0;d<dic.length;d++) {
					newPoint = x + dic[d];
					
					if(newPoint==input2) {
						return cnt+1;
					}else if(newPoint>=1 && newPoint<=10000 && point[newPoint]==0) {
						point[newPoint]=1;
						Q.offer(newPoint);
					}
				}
				
			}
			cnt++;
		}
		
		result = cnt;
		return result;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		
		System.out.print(T.solution(input1, input2));

	}
}
 

   