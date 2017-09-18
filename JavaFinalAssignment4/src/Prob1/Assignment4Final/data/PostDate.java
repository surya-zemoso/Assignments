package Prob1.Assignment4Final.data;

public class PostDate {
	
	public  String datePost(char[] s){
		String strMonth, strDate;
		int date = ((int)s[0]-'0')*10 + ((int)s[1]-'0')*1;
		int month = ((int)s[3]-'0')*10 + ((int)s[4]-'0')*1;
		int year =  ((int)s[6]-'0')*1000 + ((int)s[7]-'0')*100 + ((int)s[8]-'0')*10 + ((int)s[9]-'0')*1;
		if (month != 12 ){
			year = year;
			if (month == 1 || month == 3 || month ==  5||month == 7|| month == 8 || month == 10){
				if (date == 1){
			    date +=30;
			    month = month; }
				else { month++;
				 date--;}
				}
			else if (month == 2){
				month++;
				if (year%4 == 0){ date++;}
				else {date=date+2;}
			}
			else {
			date= date;
			month++;
			}
			}
		else {
			if (date == 1){
				date = date+30;
				year = year;
				month = month;
			}
			else {
//				System.out.println(date);
				date--;
//				System.out.println(date);
				month = 1;
				year++;
			}
		}
//		System.out.println(month);
		if (date >= 1 && date <=9){
			strDate = "0"+date;
		}
		else {strDate =Integer.toString(date); }
		if ( month >= 1 && month <= 9){
			strMonth = "0"+month;
		}
		else{strMonth =Integer.toString(month);}
		String strYear =Integer.toString(year);
		String newPostDate = strDate +"-"+ strMonth +"-"+ strYear;
//		System.out.println(newPostDate);
		return newPostDate;
		}
}
