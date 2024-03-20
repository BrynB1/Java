package Junior;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Iterator;


public class queueApp {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); 
		
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		
		Iterator<Integer> itr = q.iterator();
		
		int value;
		
		while (itr.hasNext()) {
			value = itr.next();
			System.out.println(value);
		}
	
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		System.out.println(q.size());
		
		q.remove();q.remove();q.remove();
		System.out.println(q.size());
		
		try {
			q.remove();
		}
		catch(NoSuchElementException e) {
			
		}
		
		System.out.println(q);
		
		System.out.println("Second problem: ");
		
		q.add(5);
		q.add(10);
		q.add(15);
		q.add(20);
		q.add(50);
		q.add(1);
		q.add(13);
		q.add(23);
		
		Stack<Integer> stk = new Stack<>();
		stk.push(5);
		stk.push(10);
		stk.push(15);
		stk.push(20);
		stk.push(50);
		stk.push(1);
		stk.push(13);
		stk.push(23);
		int x = 1;
		System.out.println("X is found: "+findX(stk, x));
	}
	
	public static boolean findX(Stack<Integer> stk, int x) {
		Queue<Integer> q = new LinkedList<>(); 
		//int temp;

		boolean found = false;
		
		System.out.println("Before actions: ");
		System.out.println("Stack: "+stk.toString());
		System.out.println("Queue: "+ q);
		
		while(!stk.isEmpty()) {
			if (stk.peek()==x) {
				found = true;
				break;
			}
			else
				q.add(stk.pop());
		}
		
		System.out.println("After 1st while loop: ");
		System.out.println("Stack: "+ stk);
		System.out.println("Queue: "+ q);
			
		//now we have examined the stack. Either we found x, or stack is empty.
		//next step return element we popped out to the stack
		
		int count = q.size();  //record how many element we popped out
		while (!q.isEmpty()) {
			stk.push(q.remove());
		}
	
		System.out.println("After 2nd while loop: ");
		System.out.println("Stack: "+ stk);
		System.out.println("Queue: "+ q);
		
		for (int i = 0; i<count; i++) {
			q.add(stk.pop());
		}
		
		System.out.println("After 1st for loop: ");
		System.out.println("Stack: "+ stk);
		System.out.println("Queue: "+ q);
		
		for (int i = 0; i<count; i++) {
			stk.push(q.remove());
		}
		
		System.out.println("After 2nd for loop: ");
		System.out.println("Stack: "+ stk);
		System.out.println("Queue: "+ q);
		
		return found;
		
	}

}
