package training;

public class Furniture {
	
	int width;
	int height;
	
	void display(String item) {
		System.out.println(item + " width " + width + " Height " + height);
	}
	
	public static void main(String[] args) {
		
		Chair harsha = new Chair();
		harsha.foo();
		
	}
}
class Chair extends Furniture{
	void foo() {width=10;height=20;display("chair");
		
	}
}
 class Table extends Furniture{
	 void foo() {width=30;height=50;display("Table");
	
 }
 
 class Almira extends Furniture{
	 void foo() {width=100;height=200;display("Almira");
	 }
 }
 }
