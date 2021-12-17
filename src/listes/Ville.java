package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {
	
	
	Continent continent;
	public String nom;
	public int nbHabitants;
	
	public Ville(String nom, int nbHabitants, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + " " + nbHabitants + " " + continent.getLibelle();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbHabitants;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
	
}

