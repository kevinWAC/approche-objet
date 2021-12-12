package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique {
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double perimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

}
