package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse = new AdressePostale();
	
	public Personne(String nvNom, String nvPrenom, int nvNumeroRue, String nvLibelle, int nvCodePostale, String ville ) {
		nom = nvNom;
		prenom = nvPrenom;
		adresse.numeroRue = nvNumeroRue;
		adresse.libelleRue = nvLibelle;
		adresse.codePostale = nvCodePostale;
		adresse.codePostale = nvCodePostale;
	}
}
