package Prob1.Assignment2Final.data;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class CheckString {
	
	public void check() throws Exception{
		
		HashSet<String> set=new HashSet<String>(); 
		Scanner s1 = new Scanner(System.in);
		while(true){
			char c = (char) System.in.read();
			if (c == '\n'){
				break;}
			else{
			if ((int)c >= 97 && (int)c <= 122){ // checking if its a small letter & then adding it in Hashset
				set.add(Character.toString(c));}
			if ((int)c >= 65 && (int)c <=90){// checking if its a capital letter & then adding it in Hashset
				set.add(Character.toString((char)((int)c+32)));
				}
			}
		}
		s1.close();
	if (set.size() == 26 ){ System.out.println("Matched");}
	else {System.out.println("UnMatched");}
	}

	
	public static void main(String args[]) throws Exception {
		System.out.println("Enter the string to check: ");
		CheckString str = new CheckString();
		str.check();
	}
		
}
/*Here a function check() is created. this function is reading the input string & checking whether all
character of a-z or A-Z  lies or that string or not not.*/
/* Here time  complextiy is o(n) , where n represent the total number of characters in the input strings
This is beacuse of while loop running for whole length of input array.
Space complextiy = O(1)
This is because am only using a Hashset space as for storing 26 alphabets in form of character.*/