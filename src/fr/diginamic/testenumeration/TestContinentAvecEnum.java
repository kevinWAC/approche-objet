package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nantes", 100000, Continent.EUROPE));
		villes.add(new Ville("Abuja", 1236000, Continent.AFRIQUE));
		villes.add(new Ville("Pekin", 21000000, Continent.ASIE));
		villes.add(new Ville("Whashington", 800000, Continent.AMERIQUE));
		villes.add(new Ville("Canberra", 395000, Continent.OCEANIE));
		
		for(Ville ville : villes) {
			System.out.println(ville);
		}

	}

}
