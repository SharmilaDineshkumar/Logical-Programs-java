package test.pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateProgram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		String inputDate=s.nextLine();
		SimpleDateFormat format=new SimpleDateFormat("yyyymmddhhmmss");
		
			Date date=format.parse(inputDate);
			long seconds=s.nextLong();
			System.out.println("before date : "+date);
			date=addSeconds(date,seconds);
			System.out.println("after date : "+date);


		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Date addSeconds(Date date, long seconds) {
		
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
       // cal.add(Calendar.SECOND, seconds);
        cal.setTimeInMillis(cal.getTimeInMillis() + (seconds*1000));
        date=cal.getTime();
        return date;
		
		/*int year=date.getYear();
		int month=date.getMonth();
		int day=date.getDate();
		int hour=date.getHours();
		int min=date.getMinutes();
		int sec=date.getSeconds();
		
		System.out.println("year : "+year);
		System.out.println("month : "+month);
		System.out.println("date : "+day);
		System.out.println("hour : "+hour);
		System.out.println("min : "+min);
		System.out.println("sec : "+sec);*/
		
	}

}
