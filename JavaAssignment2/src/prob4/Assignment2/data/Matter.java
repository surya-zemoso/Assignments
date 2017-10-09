package prob4.Assignment2.data;

public class Matter {
	
	private String liquid;
	
	public Matter(String liq){
		this.liquid = liq;
		System.out.println("Argument = "+liquid);
}
public static void main(String args[]){
	
	Matter m[] = new Matter[3];
	
    m[0] = new Matter("Oil");
    m[1] = new Matter("Milk");
	m[2] = new Matter("Solid");
	
//	After assigning the object to matter class array, we are able to print all the 
//	object inside this class.
    
}
}