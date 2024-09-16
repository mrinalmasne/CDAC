package Day14_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		try {
			String pattern = "dd/MM/yyyy";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String strDate = "14/10/2001";
			Date date = sdf.parse(strDate);
			System.out.println( date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
		
	
	
	public static void main3(String[] args) {
		String pattern="dd MM ,yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		Date date=new Date();
		String str=sdf.format(date);
		System.out.println(str);
	}
	public static void main2(String args[]) {
		long timeMillis=System.currentTimeMillis();
		Date date=new Date(timeMillis);
		System.out.println(date.toString());
		int day=date.getDate();
		int month=date.getMonth()+1;
		int year=date.getYear()+1900;
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public static void main1(String args[]) {
		Date date=new Date();
		int day=date.getDate();
		int month=date.getMonth()+1;
		int year=date.getYear()+1900;
		System.out.println(day+"/"+month+"/"+year);
	}
}
