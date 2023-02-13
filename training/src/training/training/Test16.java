package training;

import java.util.Vector;

public class Test16 {
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		
		vec.add("texas");
		vec.add("zurish");
		vec.add("newyork");
		
		Iterator pointer = vec.iterator();
		
		while(pointer.hasNext()) {
			System.out.println(pointer.next());
		}
	}

}
