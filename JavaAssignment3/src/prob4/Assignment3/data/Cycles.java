package prob4.Assignment3.data;

public interface Cycles {
void print();
}
class Unicycle implements Cycles{
	public void print(){
		System.out.println("This is Unicycle factories");}
	public void uniFactories(){
		print();
	}
	
}

class Bicycle implements Cycles{
	public void print(){
		System.out.println("This is Bicycle factories");
}
	public void biFactories(){
		print();
	}
}

class Tricycle implements Cycles{
	public void print(){
		System.out.println("This is Tricycle factories");
}
	public void triFactories(){
		print();
	}	
}





