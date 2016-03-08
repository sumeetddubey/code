package code;

import java.util.*;

public class DateTime {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		int day, month, year;
		int hour,second;
		int minute;
		day = cal.get(cal.DAY_OF_MONTH);
		month = cal.get(cal.MONTH);
		year = cal.get(cal.YEAR);
		hour = cal.get(cal.HOUR);
		minute = cal.get(cal.MINUTE);
		second = cal.get(cal.SECOND);
		System.out.println("Todays date is "+day+ "/"+month+"/"+year);
		System.out.println("The current time is "+hour+":"+minute+":"+second);
	}

}
