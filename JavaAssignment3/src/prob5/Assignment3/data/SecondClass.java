package prob5.Assignment3.data;

public class SecondClass {
	void second(){
		System.out.println("This is 2nd Outer class");
	}

	public static class SecondInnClass extends OuterClass.InnerClass{
		
		public SecondInnClass(String s){
			
	// the sub class constructor must explicitly call super class constructor using an instance of 
	// outer class. Because, we  can’t access non-static inner class without the instance of outer class.
			
			new OuterClass().super(s);
			System.out.println("This is 2nd Inner class constructor");
		}
	}
	}