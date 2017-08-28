package prob2.Assignment3.data;

class Cycle {
	Cycle(){
		System.out.println("Cycle class");
	}
}

class Unicycle extends Cycle{
	Unicycle(){ System.out.println("unicycle class");}
void balance() { System.out.println("Unicycle balance");}
}
class Bicycle extends Cycle{
	Bicycle(){ System.out.println("bicycle class");}
	void balance() { System.out.println("Bicycle balance");}
}
class Tricycle extends Cycle{
	Tricycle(){ System.out.println("tricycle class");}
	
}
