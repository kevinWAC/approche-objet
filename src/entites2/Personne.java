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
		this.nom = nvNom;
		this.prenom = nvPrenom;
		this.adressePostale = adresse;
	}
	public String getName() {
		return this.nom;
	}	public String getFirstname() {
		 return this.prenom;
	}
	public void setName(String name) {
		this.nom = name;
	}
	public void setFirstname(String firstname) {
		this.prenom = firstname;
	}
	public AdressePostale adresse() {
		return this.adressePostale;
	}
	public void setAdresse(AdressePostale adresse) {
		this.adressePostale = adresse;
	}
	public void majuscule(){
		String name = this.getName().toUpperCase();
		String firstname = this.getFirstname();
		System.out.println(name + " " + firstname);
	}}