package listes;

public class Ville implements Comparable<Ville> {
	
	public String nom;
	public int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public String toString() {
		return nom + " " + nbHabitants;
	}

	@Override
	public int compareTo(Ville o) {
			if (nbHabitants > o.nbHabitants) {
				return 1;
			} if (nbHabitants < o.nbHabitants) {
				return -1;
			}		
			return 0;
	}
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;

			}
			Ville other = (Ville) object;
			return nom.equals(other.nom);
	}
}

