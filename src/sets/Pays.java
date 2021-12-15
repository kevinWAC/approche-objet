package sets;

public class Pays {
	String nom;
	long nbrHabitants;
	float pib;
	
	public Pays(String nom, long nbrHabitants, float pib) {
		this.nom = nom;
		this.nbrHabitants = nbrHabitants;
		this.pib = pib;
	}
	@Override
	public String toString() {
		return "Nom: " + this.nom + "\nnbr Habitants: " + this.nbrHabitants + "\nPIB total: " + this.pib * this.nbrHabitants;		    
	}
}
