package training;

public class Test13 {
	int getNextNo(int n) {
		try {
			if (n==5) {
				return n+1;
			}
		}
		finally {
			System.out.println("This is Important code");
		}
		return n-1;
	}
	public static void main(String[] args) {
		Test13 obj = new Test13();
		System.out.println(obj.getNextNo(5));
	}

}
