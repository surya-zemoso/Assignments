package Prob1.Assignment4Final.data;

import java.util.ArrayList;
import java.util.Scanner;

public class GruberHcMain {

	public static void main(String args[]) {
		System.out.println("Enter Number of test Input: ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		byte i = 0;
		ArrayList<String> list = new ArrayList<String>();
		char[] s = new char[21];
		char[] X = new char[10]; 
		char[] Y = new char[10]; 
		PostDate p = new PostDate();
		PreDate q = new PreDate();
		GruberHc store = new GruberHc();
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Enter date of birth & present date ");
		while(i < 2*num){
		s = scn2.next().toCharArray();
		if (i%2 == 0){X = s;}
		else {Y =s;}		
		if (i %2 != 0){ 
		    list.add(store.kycInfo(X,Y));
//		    System.out.println(Y);7
		    }
		i++;
		}
		for(String naam: list){
            System.out.println(naam);
        }
	}

}


/*In this program i haven't use any library. This program contain 5 class. GruberHcMain class is for taking input & storing in a
 * array. GruberHC class is the main class which is implementing the all class.isvalid 
 * check whether date is valid or not. PostDate return a date after 30 days. The input
 * for this class is a date array. the same for Predate. this code will take input in specified
 * format like: 12-04-2018, 04-05-2015 etc...
 * 
 * 
 * 
 * 
Enter Number of test Input: 
5
Enter date of birth & present date 
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016
16-06-2017 27-06-2017
05-01-2017 06-03-2017
No Range
05-03-2016 04-04-2016
05-03-2016 15-03-2016
*
*
*
Enter Number of test Input: 
2
Enter date of birth & present date 
12-02-1995 29-02-2001
13-12-1993 12-16-2018
Invalid current date
Invalid current date

 * 
 * */
