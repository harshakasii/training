package training;

import java.util.Iterator;
import java.util.LinkedList;

public class Test17 {
	
	public static void main(String[] args) {
		LinkedList myll = new LinkedList();
		myll.add("Ironman");
		myll.add("Thor");
		myll.add("Hulk");
		myll.add("Loki");
		
		System.out.println(myll.get(1));
		Iterator it = myll.iterator();
		
		myll.addLast("Gamora");
		myll.addFirst("AntMan");
		myll.add(2, "Natasha");
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----------------");
		System.out.println("whos at the top " + myll.peek());
		System.out.println("hey first one get out " + myll.poll());
		
		System.out.println("whos their standing at the last!" + myll.pop());
		System.out.println("----------------");
		
		it = myll.iterator();
		while (it.hasNext());
		System.out.println(it.next());
		
	}
}