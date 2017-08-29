package prob1.Assignment5.data;

import junit.framework.TestCase;

public class ExpressionChekTest extends TestCase {
   String line;
	public void testIsValid() {
		ExpressionCheck e1 = new ExpressionCheck();
		assertTrue(e1.isValid("This is me."));
		assertTrue(e1.isValid("This 1255678'][; is me."));
		assertTrue(e1.isValid("This is me."));
		assertFalse(e1.isValid("this is me."));
		assertFalse(e1.isValid("This is me"));
		assertFalse(e1.isValid(line));
		
	}

}
