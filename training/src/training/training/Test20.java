package training;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class Test20 {
	public static void main(String[] args) {
		HashSet myset = new HashSet();
		
		myset.add("red");
		myset.add("orange");
		myset.add("red");
		myset.add("orange");
		myset.add("green");
		
		System.out.println(myset);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("green");
		lhs.add("red");
		lhs.add("orange");
		lhs.add("red");
		lhs.add("orange");
		
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add("Cat");
		ts.add("Apple");
		ts.add("Ball");
		ts.add(null);
		System.out.println(ts);
		
	}

}
