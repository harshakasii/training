package training;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How long is your grep??");
		
		int grepLength = sc.nextInt();
		
		String msg = "";
		
		for (int i = 1; i<= grepLength; i++) {
			msg += "e";
		}
		System.out.println("gr" + msg + "p");
	}
}