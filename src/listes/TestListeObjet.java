package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeObjet {

	public static void main(String[] args) {
		List <Ville> villes = new ArrayList<>();
		
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 48_4000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes",40_600));
		
		Ville villePlusPeuple = villes.get(0);
		for (Ville ville: villes) {
			if (ville.nbHabitants > villePlusPeuple.nbHabitants) {
				villePlusPeuple = ville; 
			}
		}
		System.out.println(villePlusPeuple.nom);
		
		Ville villeMoinsPeuple = villes.get(0);
		for (Ville ville : villes) {
			if (ville.nbHabitants < villeMoinsPeuple.nbHabitants) {
				villeMoinsPeuple = ville;
			}
		}
		villes.remove(villeMoinsPeuple);
		
		for (Ville ville : villes) {
			if (ville.nbHabitants > 100000) {
				ville.nom = ville.nom.toUpperCase();
			}
		}
		System.out.println(villes);
	}
}
