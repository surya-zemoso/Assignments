package prob1.Assignment5.data;

import java.util.regex.*;

public class ExpressionCheck {
	boolean a;

	boolean isValid(String s){
		
	if (s == null){
		
		try { 
			throw new NullPointerException("Parameter Type cannot be null..");}
		catch(Exception m){System.out.println("Exception occured: "+m);}
		
		finally {return a;}
		}
	else {	
		  a = Pattern.matches("^[A-Z].*[\\.]$", s);
	}
	return a;
	}
}

/*
 * Matcher is ^[A-Z].*[\\.]$. ^[A-Z] - First character of matcher is in capital
 * letter .* - Any character occur 0 times or more times. [\\.]$ - This will
 * check whether last charter is "." or not. Here "$" reflects for last
 * character.
 */