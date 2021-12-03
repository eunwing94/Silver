package test07_01;
// 07-01. 재귀함수

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
  
public class Main {
	ArrayList<Integer> answer = new ArrayList<Integer>();
	StringBuilder str = new StringBuilder();

	public ArrayList<Integer> solution(int input1) {
		
		if(input1 <= 0) {
			Collections.reverse(answer);
			return answer;
		}else {
			answer.add(input1);
			return solution(input1-1);
		}		
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		
		System.out.print(T.solution(input1));

	}
}

