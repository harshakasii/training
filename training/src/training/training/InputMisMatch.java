package training;
import java.util.Scanner;

public class InputMisMatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey buddy how old are you?");
		int age = sc.nextInt();
		System.out.println("You have really grown up! you are "+ age +"years old");
	}
}