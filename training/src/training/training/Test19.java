package training;
import java.util.ArrayList;
import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		ArrayList myl = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			String item = sc.next();
			
			if(myl.contains(item)) {
				continue;
			}
			myl.add(item);
		}
		System.out.println(myl);
	}

}
