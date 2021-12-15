package maps;

import java.util.HashMap;

public class CreationEtManipulation {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		for (Integer codePostal : mapVilles.keySet()) {
			System.out.println(codePostal);
		}
		for (String ville : mapVilles.values()) {
			System.out.println(ville);
		}
		System.out.println(mapVilles.size());
	}
}
