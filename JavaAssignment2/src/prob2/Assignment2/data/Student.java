package prob2.Assignment2.data;

public class Student {
	private int rollnum ;
	private int rnum;
public Student(){
	this(5);
	rollnum = 100;
	rollnum = rollnum + rnum;
	
}
public Student(int rnum){
	this.rnum = rnum;

}
public int getRollNum() {
    return rollnum;
 }

public static void main(String args[]){
	 Student a = new Student();
	 Student b = new Student(10); 
	 System.out.println("Roll Number= " +a.getRollNum());
	 System.out.println("Roll Number= " +b.getRollNum());
	
}
}