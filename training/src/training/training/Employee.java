package training;

public class Employee {
	
	int employeeId;
	int salary;
	String dept;
	
	Employee(int empid, int sal, String d) {
		employeeId = empid;
		salary = sal;
		dept = d;
	}

	
	public static void main(String[] args) {
		Employee rahul = new Employee(101, 3000, "Testing");
		Employee sowmya = new Employee(102, 5000, "Engineering");
		
		System.out.println(rahul.employeeId + " Salary " + rahul.salary+ " Dept " + rahul.dept);
		System.out.println(sowmya.employeeId + " Salary " + sowmya.salary+ " Dept " + sowmya.dept);
	}

}
