package prob3.Assignment3.data;

public class ExtendCar extends Car implements CarABC {
	public void brandA(){System.out.println("This is Brand A");} 
	public void mileageA(){System.out.println("This is mileage of Brand A");}
	public void brandB(){System.out.println("This is Brand B");}  
	public void mileageB(){System.out.println("This is mileage of Brand B");}
	public void brandC(){System.out.println("this is Brand C");} 
	public void mileageC(){System.out.println("This is mileage of Brand C");}
	public void newcar(){System.out.println("this is Brand of new car");}  
	
	public void method1(CarA Maruti) { 
	Maruti.brandA();
	Maruti.mileageA();}
	public void method2(CarB Ford) { 
	Ford.brandB();
	Ford.mileageB();}
	public void method3(CarC Kia) { 
	Kia.brandC();
	Kia.mileageC();}
	public void method4(CarABC Hyundai) {
	Hyundai.newcar();}
}
