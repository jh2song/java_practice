package generic_queue;

import java.util.*;

class Queue<T> {
	int head;
	int tail;
	Object [] queue;
	Queue() {
		head=0;
		tail=0;
		queue = new Object[10];
	}
	public boolean isFull() {
		if((head+1)%10==tail)
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(head==tail)
			return true;
		else
			return false;
	}
	public void push(T val) {
		if(isFull()) // 가득 찼을 경우
			return;
		else
			queue[head]=val;
		head = (head+1)%10;
	}
	public T pop() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		T ret = (T)queue[tail];
		tail = (tail+1)%10;
		
		return ret;
	}
}

public class generic_queue {
	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<Integer>();
		q1.push(1);
		q1.push(2);
		q1.push(3);
		
		while(!q1.isEmpty()) {
			System.out.println(q1.pop());
		}
		
		Queue<String> q2 = new Queue<String>();
		q2.push("Rion");
		q2.push("Dog");
		q2.push("Cat");
		
		while(!q2.isEmpty()) {
			System.out.println(q2.pop());
		}
		
	}
}
