package Prob1.Assignment4Final.data;
import java.util.Scanner;
public class GruberHc {
	
//	the toDate() method return an integer array of Date containing Date,
// month, year at Date[0], Date[1], Date[2] accordingly.
	public int[] toDate(char[] c){
		int Date[] = new int[3];
		 Date[0] = ((int)c[0]-'0')*10 + ((int)c[1]-'0')*1;
		 Date[1] = ((int)c[3]-'0')*10 + ((int)c[4]-'0')*1;
		 Date[2] =  ((int)c[6]-'0')*1000 + ((int)c[7]-'0')*100 + ((int)c[8]-'0')*10 + ((int)c[9]-'0')*1;
		return Date;}
	
    char[] vary = new char[10];
	String str1,str2;
	PostDate p = new PostDate();
	PreDate q = new PreDate();
	isValidDate r = new isValidDate();
	
// kycInfo() method take input value of birth-date & current-date & check whether date is valid or not, if entered date is valid
//	then it will check for nearest anniversary date & then call will call postDate
//	& preDate class. this class basically return behind thirty days & post thirty day from a input date.
	public String kycInfo(char[] b,char[] c){
	
		if (!r.isValid(b)){
			if (r.isValid(c)==false){return "Invalid Birth & current date";}
			else{return "Invalid Birth date";}
		}
		if (r.isValid(b) == true && r.isValid(c)==false){return "Invalid current date";}
		char[] a = new char[10];
		int i;
		for(i = 0; i<10;i++){
			if (i >5){a[i] = c[i]; }
			else {a[i]=b[i];}
		}	
		
		if (toDate(b)[2] >= toDate(c)[2]){return "No Range";}
		else {
			str1 = q.datePre(a);
			vary = p.datePost(a).toCharArray();;
			
			if ((toDate(vary)[1] > toDate(c)[1]) || ((toDate(vary)[1] == toDate(c)[1]) && (toDate(vary)[0] > toDate(c)[0]))){
				str2 = String.valueOf(c);
			}
			else {str2 =  p.datePost(a);};
		}
		 
		return str1+" "+str2;
	}	
	}
