package fr.diginamic.entites;

public class Salarie {
	String nom;
	String prenom;
	double salaire;
	
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	public String toString() {
		return "Nom: " + this.nom + "\nPr�nom: " + this.prenom + "\nSalaire: " + this.prenom;		    
	}
}
