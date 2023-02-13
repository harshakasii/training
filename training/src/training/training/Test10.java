package training;

public class Test10 {
	
	int arg = 5;
	
	Test10() {
		System.out.println("Hi ! i am default constructor");
	}
	
	Test10(int arg) {
		this();
		this.arg=arg;
	}
	public static void main(String[] args) {
		int arg = 10;
		Test10 obj = new Test10(10);
		System.out.println(obj.arg);
	}

}
