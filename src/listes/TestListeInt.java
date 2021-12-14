package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println(liste);
		
		System.out.println(liste.size());	
		Collections.sort(liste);
		System.out.println(liste);
		
		int dernierIndex = liste.size() - 1;
		int nbrPlusGrand = liste.get(dernierIndex);
		System.out.println(nbrPlusGrand);
		
		liste.remove(0);
		System.out.println(liste);
		
		for(int i = 0; i <= liste.size() - 1; i++) {
			if(liste.get(i) < 0) {
				int valeur = liste.get(i);
				int positif = -valeur;
				liste.set(i, positif);
			}
		}
		System.out.println(liste);
	}

}
