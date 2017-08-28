	package prob1.Assignment3.data;
	
	abstract class Rodent {
		Rodent(){
			System.out.println("Rodents are mammals");
		}
		abstract void Eat();
		abstract void Size();
		abstract void Run();
	
	}
		
	class Mouse extends Rodent{
		
		Mouse(){
			 System.out.println("Mouse is Mammals");
		 }	 
		public void Eat() { System.out.println("Mouse likes to eat");}
		public void Size() { System.out.println("Mouse is small size");}
		public  void Run() { System.out.println("Mouse runs slowly");}
	}
		
	class Gerbil extends Rodent{
		Gerbil(){
			 System.out.println("Gerbil is Mammals");
		 }	 
		public void Eat() { System.out.println("Gerbils like to eat");}
		public void Size() { System.out.println("Gerbils is smaller than mouse");}
		public  void Run() { System.out.println("Gerbils runs medium");}
	}
		
	class Hamster extends Rodent{
			Hamster(){
				 System.out.println("Hamster is Mammals");
			 }	 
			public void Eat() { System.out.println("Hamster like to eat");}
			public void Size() { System.out.println("Hamster is larger than mouse");}
			public  void Run() { System.out.println("Hamster runs faster");}
	
	}
	