package test07_02;
// 07-01. Àç±ÍÇÔ¼ö

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
  
public class Main {
	StringBuilder str = new StringBuilder();

	public String solution(int input1) {
		
		if(input1 <= 0) {
			return str.reverse().toString(); 	// ±×³É ³¡³»¸é µÊ..
		}else {
			str.append(" ");
			str.append(input1);
			
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

