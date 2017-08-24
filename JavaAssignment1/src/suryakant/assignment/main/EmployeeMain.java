package suryakant.assignment.main;

import suryakant.assignment.data.Employee; 
import suryakant.assignment.singleton.EmployeeSingleton;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee empDetail = new Employee();
		empDetail.printEmpDetails();
		empDetail.printEmpIncome();
		
// Creating object of EmployeeSingleton class using static method !
		
		EmployeeSingleton obj1 = EmployeeSingleton.empDesig("Engineer");
		obj1.printEmployeeDesig();
					
		}
		
	}


