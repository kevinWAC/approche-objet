package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		  long debut = System.currentTimeMillis();
	        StringBuilder sb = new StringBuilder();
	        for( int i = 0; i < 100000; i++ ) {
	        	sb.append(i);
	        }
	        long fin = System.currentTimeMillis();
	        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));;
	        
	        long debut2 = System.currentTimeMillis();
	        String string = "";
	        for( int i = 0; i < 100000; i++ ) {
	        	string += i;
	        }
	        long fin2 = System.currentTimeMillis();
	        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));;
	    }
	}

