package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(10);
		Cercle cercle2 = new Cercle(25);
		System.out.println("Perimetre: " + cercle1.perimetre() + "\nSurface: " + cercle1.surface());
		System.out.println("Perimetre: " + cercle2.perimetre() + "\nSurface: " + cercle2.surface());
		System.out.println(CercleFactory.cerclefactory(10).perimetre());
		System.out.println(CercleFactory.cerclefactory(10).surface());
	}

}
