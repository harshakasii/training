package training;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test15 {
	public static void main(String[] args) {
		ArrayList<String> ss = new ArrayList<String>();
		ss.add("Calfornia");
		ss.add("Alabama");
		ss.add("Aaska");
		ss.add("Arkansas");
		
		System.out.println("ArrayList: " + ss);
		String s = ss.get(2);
		System.out.println("I got " + s);
		
		ss.set(2, "Texas");
		System.out.println("After Updation : " + ss);
		
		String t = ss.remove(3);
		System.out.println("State Removed is " + t);
		System.out.println("ArrayList After Selection " + ss);
		
		ss.sort(Comparator.naturalOrder());
		System.out.println("ArrayList After	Sorting " + ss);
		
		System.out.println("Is NewYork There? " + ss.contains("newyork"));
		System.out.println("Texas is at " + ss.indexOf("Texas")+ " index");
		
		System.out.println("Is List Empty ? " + ss.isEmpty());
		ss.removeAll(ss);
		
		System.out.println("Is List Empty ? " + ss.isEmpty());
	}
}