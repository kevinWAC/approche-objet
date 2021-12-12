package fr.diginamic.banque.entites;

public abstract class Operation {
	public String date;
	public float montant;

	public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String toString( ) {
		return "Date d'opération: " + this.date + "\nMontant de l'opération: " + this.montant;	
	}
	
	public abstract String getType();
}
