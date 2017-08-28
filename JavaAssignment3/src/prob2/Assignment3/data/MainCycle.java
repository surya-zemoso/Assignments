package prob2.Assignment3.data;

public class MainCycle {

		public static void main (String[] args) {
			
 //Creating instance of each subclasses !
			Unicycle uc = new Unicycle();
			Bicycle bc = new Bicycle();
	        Tricycle tc = new Tricycle();
           Cycle[] cycle = new Cycle[3]; // casting in array
           cycle[0] = uc;
           cycle[1] = bc;
           cycle[2] = tc;
           
//          cycle[0].balance();
//   		cycle[1].balance();
//   		cycle[2].balance();- (balance method is not defined for tricycle class)
// This will give error because  the balance() method is not defined in cycle class so we need to downcast it to
// Unicycle class, Bicycle class & Tricycle class !
           
           
        System.out.println("\nDown-casting subclass of cycle to cycle class\n");
   		Unicycle uc_down = (Unicycle) cycle[0];
   		Bicycle bc_down = (Bicycle) cycle[1];
        // Tricycle tc_down = (Tricycle) cycle[2];
        
        uc_down.balance();
        bc_down.balance();
        
           
}
}