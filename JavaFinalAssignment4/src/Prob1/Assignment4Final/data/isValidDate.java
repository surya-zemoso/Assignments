package Prob1.Assignment4Final.data;

public class isValidDate {
	

	public boolean  isValid(char[] c){
		boolean b = true;
		
		try{
		GruberHc m = new GruberHc();
		int[] date = m.toDate(c);
//		System.out.println(date[1]);
		if (date[2]%4 != 0){
			if (date[1] > 12 || date[1] < 1){b =false; return b;}
			else { if (date[1] == 4 || date[1] ==6 ||date[1] == 9 || date[1] ==11){
				     if (date[0]>30 || date[0]<1){b = false; return b;}
				     else return b; }
				  else if (date[1]==2){ if(date[0] >28 || date[0]<1){b =false;return b;}
				  						else return b; }
				  else {if (date[0]>31 || date[0]<1){b = false; return b;}
				     else return b; } }
//			catch (Exception e){System.out.println(e);
			}
		else{ 
			if (date[1] > 12 || date[1] < 1){b =false; return b;}
			else { if (date[1] == 4 || date[1] ==6 ||date[1] == 9 || date[1] ==11){
				     if (date[0]>30 || date[0]<1){b = false; return b;}
				     else return b; }
				  else if (date[1]==2){ if(date[0] >29 || date[0]<1){b =false;return b;}
				  						else return b; }
				  else {if (date[0]>31 || date[0]<1){b = false; return b;}
				     else return b; } }
		}
		}
		catch (Exception e){System.out.println(e);}
		
		return b;
	}
	
}
