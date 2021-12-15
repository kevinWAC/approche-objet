package sets;

import java.util.HashSet;
import java.util.List;

public class TestSetPays {

	public static void main(String[] args) {
	    HashSet<Pays> set = new HashSet<>(List.of(
            new Pays("usa", 332915000, 59495),
            new Pays("France", 65426000, 43551),
            new Pays("Allemagne", 83900000, 50206),
            new Pays("uk", 68207000, 43620),
            new Pays("Italie", 60367000, 37970),
            new Pays("Japon", 126051000, 42659),
            new Pays("Chine", 7874966000L, 16624),
            new Pays("Russie", 145912000, 28712),
            new Pays("Inde", 1393409000, 5174)
        ));
	 
	    Pays paysPibMax = set.iterator().next();
	    Pays paysTotalPibMax = paysPibMax;
	    Pays paysTotalPibMin = paysTotalPibMax;
	    for (Pays pays : set) {
	    	if (paysPibMax.pib < pays.pib) {
	    		paysPibMax = pays;
	    	}
	    	if (paysTotalPibMax.pib*paysTotalPibMax.nbrHabitants < pays.pib*pays.nbrHabitants) {
	    		paysTotalPibMax = pays;
	    	}
	    	if (paysTotalPibMin.pib*paysTotalPibMin.nbrHabitants > pays.pib*pays.nbrHabitants) {
	    		paysTotalPibMin = pays;
	    	}
		}
	    System.out.println(paysPibMax);
	    System.out.println(paysTotalPibMax);
	    System.out.println(paysTotalPibMin);
	    paysTotalPibMin.nom = paysTotalPibMin.nom.toUpperCase();
	    System.out.println(set);
	    set.remove(paysTotalPibMin);
	    
	    
	}
}

