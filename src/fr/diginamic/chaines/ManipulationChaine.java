package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCharactere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCharactere);
		System.out.println("longueur de chaine de charactère: " + chaine.length());
		int index = chaine.indexOf(";");
		int index2 = chaine.indexOf(";", chaine.indexOf(";") + 1);
		System.out.println("Index du premier ;: " + index);
		String nom =  chaine.substring(index + 1 , index2);
		System.out.println("Nom de la personne: " + nom);
		System.out.println("Nom de la personne en majuscule: " + nom.toUpperCase());
		System.out.println("Nom de la personne en minuscule: " + nom.toLowerCase());
		String mots[] = chaine.split(";");
		System.out.println(Arrays.toString(mots));
		String salaireReplace = mots[2].replace(" ", "");
		double salaire = Double.parseDouble(salaireReplace);
		System.out.println(new Salarie(mots[0], mots[1], salaire));
		
	}

}
