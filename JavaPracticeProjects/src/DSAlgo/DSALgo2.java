package DSAlgo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSALgo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*REMOVE FIRST OCCURRENCE FROM LINKEDLIST*/
		LinkedList<Integer>ll=new LinkedList<Integer>(); 
		for(int i=1;i<=10;i++)
			ll.add(i);
		System.out.println(ll);
		int key=5;
		ll.removeFirstOccurrence(key);
		System.out.println(ll);
		
		Stack<Integer>st=new Stack<Integer>();
		for(int i=1;i<=10;i++)
			st.push(i);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.push(11));
		System.out.println(st);
		
		Queue<Integer>q=new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
			q.add(i);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
	}

}
