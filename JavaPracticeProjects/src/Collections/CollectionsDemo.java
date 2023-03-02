package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	enum Names{Alex,Aiden,Ben,Cathy};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			al.add(i);
		System.out.println("ArrayList->");
		System.out.println(al);
		List<Integer>v=new Vector<Integer>();
		for(int i=1;i<=20;i++)
			v.add(i);
		System.out.println("Vector->");
		System.out.println(v);
		List<Integer>ll=new LinkedList<Integer>();
		for(int i=1;i<=10;i++)
			ll.add(i);
		System.out.println("LinkedList->");
		System.out.println(ll);
		List<Integer>st=new Stack<Integer>();
		for(int i=1;i<=20;i++)
			st.add(i);
		System.out.println("Stack->");
		System.out.println(st);
		System.out.println("--------------------------------------------");
		List<String>ls=new ArrayList<String>();
		ls.add("Alex");
		ls.add("Ben");
		ls.add("Cathy");
		ls.add("Alex");
		ls.add("Benny");
		Set<String>hs=new HashSet<String>(ls);
		System.out.println("Hashset->");
		System.out.println(hs);
		Set<String>lhs=new LinkedHashSet<String>(ls);
		System.out.println("LinkedHashSet->");
		System.out.println(lhs);
		Set<String>ts=new TreeSet<String>(ls);
		System.out.println("TreeSet->");
		System.out.println(ts);
		System.out.println("---------------------------------------------");
		Queue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=10;i>=1;i--)
		{
			pq.add(i);
			pq.add(i);
		}
		System.out.println("Priority Queue->");
		System.out.println(pq);
		System.out.println("---------------------------------------------");
		Deque<Integer> ad=new ArrayDeque<Integer>(); 
		for(int i=1;i<=10;i+=2)
		{
			ad.addFirst(i);
			ad.addLast(i+1);
		}
		System.out.println("Deque->");
		System.out.println(ad);
		System.out.println("---------------------------------------------");
		Map<String,Integer>hp=new HashMap<String,Integer>();
		hp.put("Alex", 1);
		hp.put("Ben", 2);
		hp.put("Aiden", 3);
		hp.put("Cathy", 4);
		System.out.println("HashMap->");
		System.out.println(hp);
		Map<String,Integer>tp=new TreeMap<String,Integer>();
		tp.put("Alex", 1);
		tp.put("Ben", 2);
		tp.put("Aiden", 3);
		tp.put("Cathy", 4);
		System.out.println("TreeMap->");
		System.out.println(tp);
		Map<Names,Integer>ep=new EnumMap<Names,Integer>(Names.class);
		ep.put(Names.Alex, 1);
		ep.put(Names.Aiden, 2);
		ep.put(Names.Ben, 3);
		ep.put(Names.Cathy, 4);
		System.out.println("EnumMap->");
		System.out.println(ep);
		
	}

}
