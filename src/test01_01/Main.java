package test01_01;
// 01-01. ���ڿ����� Ư�� ���� ã��
import java.util.Scanner;
  
public class Main {
	
	public int solution(String str, char t) {
		int anwser = 0;
		int cnt = 0;
		int len = str.length();
	    String a = Character.toString(t).toLowerCase();
	    str = str.toLowerCase();
	    t = a.charAt(0);

	    for(int i=0;i<len;i++) {
	    	if(str.charAt(i)==t) {
	    		cnt++;
	    	}
	    }
	    
	    anwser = cnt;
		return anwser;
		
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		String input1 = in.next();
		char input2 = in.next().charAt(0);
	    
		System.out.println(T.solution(input1, input2));
	}
}