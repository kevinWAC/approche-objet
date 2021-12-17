package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString<ville> {

	public static void main(String[] args) {
		
		ArrayList<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		ArrayList<String> villesMajuscule = new ArrayList<>();
		
		String villeAvecLePusDeLettre=villes.get(0);
		for (String ville : villes) {
			if(ville.length() > villeAvecLePusDeLettre.length()) {
				villeAvecLePusDeLettre = ville;				
			}
			villesMajuscule.add(ville.toUpperCase());
		}
		
		
		System.out.println(villeAvecLePusDeLettre);
		System.out.println(villesMajuscule);
		
		Iterator<String> iter = villesMajuscule.iterator();
		while(iter.hasNext()) {
			String ville = iter.next();
			char lettre = ville.charAt(0);
			if (lettre == 'N') {
				iter.remove();
			}
		}
		System.out.println(villesMajuscule);
	}
}
