package test01_09;
// 01-10. 문자열에서 숫자만 추출
import java.math.*;
import java.util.Scanner;
  
public class Main {
	
	public BigInteger solution(String input1) {

		// 작은 int Type인 경우
		int answer = 0;
		
		String orgStr = input1.replaceAll("[^0-9]","");
		// 작은 int Type인 경우 (2^32 미만인 경우)
		//int newNumber = Integer.valueOf(orgStr); 
		//answer = newNumber;

		// 큰 int Type인 경우 (2^32 이상인 경우)
		BigInteger answer2 = new BigInteger("0");
		answer2 = new BigInteger(orgStr); 
		
		return answer2;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));

	}
}