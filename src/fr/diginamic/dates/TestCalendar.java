package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 4, 19, 23, 59, 30);
		Date date1 = calendar.getTime();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(date1));
		
		Date date2 = new Date();
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(format2.format(date2));
		
		SimpleDateFormat format3 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.FRANCE);
		System.out.println(format3.format(date2));
		
		SimpleDateFormat format4 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINA);
		System.out.println(format4.format(date2));
		
		SimpleDateFormat format5 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMANY);
		System.out.println(format5.format(date2));
	}
}
