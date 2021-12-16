package equals;

import listes.Ville;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Nice", 30000);
		Ville ville2 = new Ville("Nice", 30000);
		
		System.out.println(ville1.equals(ville2)); //true
		System.out.println(ville1 == ville2); //false
		
		ville2.nbHabitants = 10000;
		System.out.println(ville1.equals(ville2)); //false
		System.out.println(ville1 == ville2); //false

		ville2 = ville1;
		System.out.println(ville1 == ville2); //true

	}
}
