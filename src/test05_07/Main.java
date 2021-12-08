package test05_07;
// 05-07. 교육과정 설계
import java.util.*;
  
public class Main {
	
	public String solution(String input1, String input2) {
		String answer = "YES";
		
		Queue<Character> q = new LinkedList<>();
		
		for(int i=0;i<input1.length();i++) {
			q.offer(input1.charAt(i));			
		}
		
		
		for(char x : input2.toCharArray()) {
			if(x == q.peek()) {
				
				q.poll();
			}
			if(q.isEmpty()){
				answer = "YES";
				break;
			}else {
				answer = "NO";
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		
		System.out.print(T.solution(input1, input2));

	}
}

