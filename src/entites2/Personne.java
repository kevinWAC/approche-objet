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
	public String GetName() {
		return this.nom;
	}	public String GetFirstname() {
		 return this.prenom;
	}
	public void SetName(String name) {
		this.nom = name;
	}
	public void SetFirstname(String firstname) {
		this.prenom = firstname;
	}
	public AdressePostale Adresse() {
		return this.adressePostale;
	}
	public void SetAdresse(AdressePostale adresse) {
		this.adressePostale = adresse;
	}
	public void Majuscule(){
		String name = this.GetName().toUpperCase();
		String firstname = this.GetFirstname();
		System.out.println(name + " " + firstname);
	}}