package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adresseP1 = new AdressePostale(3, "des champs", 44500, "Nantes");
		Personne personne1 = new Personne("Doe","John", adresseP1);
	}
}
