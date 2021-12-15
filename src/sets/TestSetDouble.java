package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		double plusGrandNombre = 0;
		double plusPetitNombre = 0;
		for (Double nombre : set) {
			System.out.println(nombre);
			if (nombre > plusGrandNombre) {
				plusGrandNombre = nombre;
			}
			if (nombre < plusGrandNombre) {
				plusPetitNombre = nombre;
			}
		}
		set.remove(plusPetitNombre);
		System.out.println(set);
	}
}
