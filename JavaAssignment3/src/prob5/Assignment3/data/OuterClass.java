package prob5.Assignment3.data;

 public class OuterClass {
	 void outer(){
		 System.out.println("This is first Outer class");
	 }
	
	public class InnerClass{
		public InnerClass(String s){
			System.out.println("This is first Inner class constructor");
			
		}
	}

}
 
