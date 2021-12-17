package fr.diginamic.testenumeration;

public enum Saison {
PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);
	
	
	private String libelle;
	private int numOrdre;
	
	private Saison(String libelle, int numOrdre) {
		this.libelle = libelle;
		this.numOrdre = numOrdre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNumOrdre() {
		return numOrdre;
	}
	
	public static Saison getSaison(String libelle) {
		for(Saison saison: values()) {
			if (saison.libelle == libelle) {
				return saison;
			}
		}
		return null;
	}

}
