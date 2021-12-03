package test01_06;
// 01-06. 중복 문자 제거

import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
	
	public String solution(String input1) {
		String answer = new String();
		
		// 1번째 방법 (첫번째 알파벳과 비교)
		char[] arr = input1.toCharArray();
		char flag;
		
		for(int i=0;i<arr.length;i++) {
			flag = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(flag==arr[j]) {
					arr[j] = '_';
				}
			}
		}
		answer = String.valueOf(arr).replaceAll("_", "");
		
		// 2번쨰 -> indexOf 를 쓰면 중복된 char는 index도 겹치게 나오지..
		answer = ""; // 초기화
		for(int i=0;i<arr.length;i++) {
			System.out.println(input1.charAt(i) + "는 " + input1.indexOf(input1.charAt(i)) + "번 째에 위치함.");
			// 이 for 문의 i와 input1.indexOf(input1.charAt(i)) 가 일치할 때에만 첫 등장!!
			if(i == input1.indexOf(input1.charAt(i))) {
				answer += input1.charAt(i);
			}
		}
		
		return answer;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.nextLine();
		
		System.out.println(T.solution(input1));

	}
}