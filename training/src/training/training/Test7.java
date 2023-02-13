package training;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed : ");
		int speed = sc.nextInt();
		
		System.out.println("Today is your Birthday");
		boolean isBirthday = sc.nextBoolean();
		
		if (isBirthday == true)
		{
			speed -= 5;
		}
		
		if (speed > 80)
		System.out.println("High Ticket");
		else if (speed >= 60)
		System.out.println("Mid ticket");
		else 
		System.out.println("No Ticket");
	}
}
