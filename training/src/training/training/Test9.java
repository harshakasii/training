package training;

public class Test9 {
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(Test9.isEven(21));
	}
}