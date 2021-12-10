package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nvNom, String nvPrenom ) {
		nom = nvNom;
		prenom = nvPrenom;
	}
	
	public Personne(String nvNom, String nvPrenom, AdressePostale adresse) {
		nom = nvNom;
		prenom = nvPrenom;
		adressePostale = adresse;
	}
}
