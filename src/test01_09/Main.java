package test01_09;
// 01-10. ���ڿ����� ���ڸ� ����
import java.math.*;
import java.util.Scanner;
  
public class Main {
	
	public BigInteger solution(String input1) {

		// ���� int Type�� ���
		int answer = 0;
		
		String orgStr = input1.replaceAll("[^0-9]","");
		// ���� int Type�� ��� (2^32 �̸��� ���)
		//int newNumber = Integer.valueOf(orgStr); 
		//answer = newNumber;

		// ū int Type�� ��� (2^32 �̻��� ���)
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