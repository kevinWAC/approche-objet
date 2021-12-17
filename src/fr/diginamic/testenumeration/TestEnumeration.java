package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		for (Saison saison: Saison.values()) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		Saison saison = Enum.valueOf(Saison.class, nom);
		System.out.println(saison.getLibelle());
		
		String libelle = "Hiver";
		Saison saisonLibelle = Saison.getSaison(libelle);
		System.out.println(saisonLibelle);
		
	}

}
