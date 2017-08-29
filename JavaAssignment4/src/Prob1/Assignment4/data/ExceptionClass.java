package Prob1.Assignment4.data;
// Created 3 exceptions- ExceptionInAge, ExceptionInName, ExceptionInID
class ExceptionInAge extends Exception {
	ExceptionInAge(String s) {
		super(s);
	}
}

class ExceptionInName extends Exception {
	ExceptionInName(String s) {
		super(s);
	}
}

class ExceptionInId extends Exception {
	ExceptionInId(String s) {
		super(s);
	}
}

public class ExceptionClass {
	static void validate(int check, String s) throws ExceptionInAge,
			ExceptionInId, ExceptionInName {
		if (check < 0) {
			throw new ExceptionInAge("not valid Age");
		}
		if (check < 10 && check > 0) {
			throw new ExceptionInId("not valid Id");
		}
		if (check >= 10) {
			throw new ExceptionInName("not valid Name");
		}

		if (s != null) {
			System.out.println("No exception occured- Enjoy The life");
		}
		if (s == null){
			throw new NullPointerException("Parameter Type cannot be null- Null pointer Exception is throwing");
		}
		
	}
//     if we put check = 0 then i wont throw 1st three exceptions & if s == null then it will throw Null Pointer 
//	   exceptions, else it wont show any exception. if check != 0, in this case it will throw any from the first 
//	   three exceptions. if it throw any exceptions then it wont throw further any exceptions.
	static String sun ;
	public static void main(String args[]) {
		
		try {
		validate(10,sun);
		}catch (Exception m){System.out.println("Exception occured: "+m);}  
		finally {System.out.println("Your code is forwarding... ");}
	}
}