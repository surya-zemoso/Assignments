package prob4.Assignment3.data;

public class MainCycle {
	public static void main(String[] args) {
        Unicycle u=new Unicycle();
        Bicycle b=new Bicycle();
        Tricycle t=new Tricycle();
        u.uniFactories();
        b.biFactories();
        t.triFactories();
    }
}