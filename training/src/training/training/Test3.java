package training;
import java.util.Scanner;
import java.util.Random;

public class Test3 {
	public static void main(String[] args) {
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int computerChoice = rn.nextInt(20);
		
		for (int i =0; i<=6; i++) {
			System.out.println("Guess a number between 0 and 20");
			int userChoice = sc.nextInt();
			System.out.println("Computer choice : " + computerChoice);
			
			if(userChoice > computerChoice) {
				System.out.println("Your guess is high!!");
			}
			else if(userChoice < computerChoice) {
				System.out.println("Your guess is too Low!!");
			}
			else {
				System.out.println("Gotcha! you guessed it Right!!");
				break;
			}
		}
	}
}