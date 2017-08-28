package prob1.Assignment3.data;

public class TestRodent {
	public static void main(String[] args) {
		
		Rodent[] r = new Rodent[3] ;
		r[0] = new Mouse();
		r[0].Eat();
		
		r[1] = new Gerbil();
		r[1].Size();
		
		r[2] = new Hamster();
		r[2].Run();
	}
	}