package suryakant.assignment.data;

public class Employee {
	String name;
	   int age;
	   
public void printEmpDetails() {
		 System.out.println("Name:"+ name );
		 System.out.println("Age:" + age );
}
public void printEmpIncome() {
	float income;
	int   employeeID;
	
/*
 * The local variable income & employeeID is not initialized here.As there is no default 
 * values for local variables. So,For printing these local variable we need to initialized 
 * with some initial values first.*/
	
	//System.out.println("Employee ID:"+ employeeID );
	//System.out.println("Employee Income:" + income);
}
}