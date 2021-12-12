package fr.diginamic.banque.entites;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		tab[0] = new Cercle(10);
		tab[1] = new Rectangle(10, 5);
		for (ObjetGeometrique objetGeometrique : tab) {
			System.out.println("Perimetre: " + objetGeometrique.perimetre() + "\nSurface: " + objetGeometrique.surface());
		}
	}
}
