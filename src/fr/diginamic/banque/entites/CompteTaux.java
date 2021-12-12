package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	int tauxRemuneration;
	
	public CompteTaux(int numeroCompte, int soldeCompte, int tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public String toString() {
		return "\n" + super.toString() + "\nTaux rémunération: " + tauxRemuneration;
	}
}
