package training;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Division ");
		int div = sc.nextInt();
		switch(div) {
		case 1:
			System.out.println("First Rank");
			break;
		case 2:
			System.out.println("Second Rank");
			break;
		case 3:
			System.out.println("Third Rank");
			break;
		default:
			System.out.println("NO Rank");
			break;
		}
	}
}
