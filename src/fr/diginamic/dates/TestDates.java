package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date d1 = new Date(121, 11, 16);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(d1));
		
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(formateur2.format(d2));
		
		Date d3 = new Date();
		System.out.println(formateur2.format(d3));
	}

}
