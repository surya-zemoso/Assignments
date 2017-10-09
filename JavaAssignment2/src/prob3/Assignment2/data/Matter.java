package prob3.Assignment2.data;

public class Matter {
	
	private String liquid;
	
	public Matter(String liq){
		this.liquid = liq;
		System.out.println("Argument = "+liquid);
	

}
public static void main(String args[]){
	
	Matter m[] = new Matter[3]; //Array referencing to matter class


// Here initialization message from constructor call isn't printing. Because 
//	its just create an array of Matter class but didn't assigned any value to 
//	those array. So, when we run the program, its basically don't call constructor.

}
}