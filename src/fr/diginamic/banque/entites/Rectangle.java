package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique {
	float longueur;
	float largeur;
	
	public Rectangle(float longueur, float largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double perimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}

	@Override
	public double surface() {
		double surface = longueur * largeur;
		return surface;
	}

}
