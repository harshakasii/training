package training;

class App {
	App() {
		System.out.println("Constructer of App");
	}
	App(int num) {
		System.out.println(num);
	}
}

public class Test11 extends App {
	Test11() {
		super(20);
		System.out.println("Constructer of Test11");
	}
	public static void main(String[] args) {
		new Test11();
	}
}
