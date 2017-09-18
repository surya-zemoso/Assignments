package Prob1.Assignment4Final.data;

public class PreDate {
	
	public  String datePre(char[] s){
		String strMonth, strDate;
		int date = ((int)s[0]-'0')*10 + ((int)s[1]-'0')*1;
		int month = ((int)s[3]-'0')*10 + ((int)s[4]-'0')*1;
		int year =  ((int)s[6]-'0')*1000 + ((int)s[7]-'0')*100 + ((int)s[8]-'0')*10 + ((int)s[9]-'0')*1;
//		System.out.println(+date);
//		char[] newdate = new char[10];
		if (month != 1 ){
			year = year;
			if (date == 31){
			      month = month;
			      date = date-30;}
		
			else {
				if (month == 2 || month == 4 || month ==  6||month == 9|| month == 11 ){
					date++;
					month--;}
				else if (month == 3){
					if (year%4 == 0){
						date --;
					    month--;
					}
					else{
						date = date -2;
						month--;
					}
				}
				else{
					date = date;
					month--;
				}
			}
		}
		else {
			if (date == 31){
				date = date -30;
				year = year;
				month = month;
			}
			else {
				date++;
				month = 12;
				year--;
			}
		}
		if (date >= 1 && date <=9){
			strDate = "0"+date;
		}
		else {strDate =Integer.toString(date); }
		if ( month >= 1 && month <= 9){
			strMonth = "0"+month;
		}
		else{strMonth =Integer.toString(month);}
		String strYear =Integer.toString(year);
		String newPreDate = strDate +"-"+ strMonth +"-"+ strYear;
//		System.out.println(newPreDate);
		return newPreDate;
		}
}
