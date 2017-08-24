package suryakant.assignment.singleton;

public class EmployeeSingleton {
	String designation;
	
	public static EmployeeSingleton empDesig( String str1) {
		
/* As string "designation" is declared in non static field, so we can't access this as a  
   static references. If we want to access it, first we need to declare this string in 
   static way. "static String designation ;" */
		
//  designation = str1;
	  EmployeeSingleton temp = new EmployeeSingleton();
	  return temp;
		
	}
	public void printEmployeeDesig() {
		System.out.println("Employee Designation: " + designation);
	}
}
