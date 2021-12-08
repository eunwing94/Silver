package test05_08;
// 05-08. 우선순위에 맞게 병원진료 순서 세팅
import java.util.*;
  

class Person {
	int idx;
	int priority;
	
	Person(int idx, int priority){
		this.idx = idx;
		this.priority = priority;
	}
	
}
public class Main {
	
	
	public int solution(int input1, int input2, int[] arr) {
		int answer = 0;
		int x=0;
		int cnt = 0;
		Queue<Person> q = new LinkedList<>();
		int init_idx = 0;
		int init_priority = 0;
		
		ArrayList<Integer> order = new ArrayList<Integer>();
		
		for(int i=0;i<input1;i++) {
			Person p = new Person(i,arr[i]);
			q.offer(p);
		}
		
		while(!q.isEmpty()) {
			// 초기값 세팅 및 poll
			Person init_person = q.poll();
			
			// 객체로 for문
			for(Person tmp : q) {
				if(init_person.priority < tmp.priority) {
					q.offer(init_person);
					init_person = null;
					break;
				}
			}
			
			// 1번째 방법
			if(init_person!=null) {	// 즉 위의 큐 중에서 가장 앞놈이 제일 위험순위 높은 놈일 때
				order.add(init_person.idx);
			}
			
			// 2번째 방법
			if(init_person!=null) {	// 즉 위의 큐 중에서 가장 앞놈이 제일 위험순위 높은 놈일 때
				cnt++;
				if(init_person.idx == input2) {
					return cnt;
				}
			}
		}
		answer = order.indexOf(input2) + 1;
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner in=new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int[] arr = new int[input1];
		for(int i = 0;i<input1;i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(T.solution(input1, input2, arr));

	}
}

