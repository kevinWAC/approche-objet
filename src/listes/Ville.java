package listes;

public class Ville {
	
	String nom;
	int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public String toString() {
		return nom + " " + nbHabitants;
	}
}

