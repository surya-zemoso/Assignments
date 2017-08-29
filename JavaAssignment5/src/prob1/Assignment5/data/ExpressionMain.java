package prob1.Assignment5.data;

import java.util.Scanner;

public class ExpressionMain {
	static String line;
	
	ExpressionCheck e = new ExpressionCheck();
	public void checkStr(String k){
		if (e.isValid(k) == true){System.out.println("Valid expression-Pattern Matched");}
		else {System.out.println("InValid expression-Unmatched Pattern");}
		
	}
	public static void main(String args[]){
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the expression");
//		String line =scan.nextLine();
		ExpressionMain x = new ExpressionMain();
		x.checkStr(line);
		x.checkStr("A day with Hunters.");
		x.checkStr("winter is here.");
		x.checkStr("Danerys is queen.");


}
}
