package sets;

import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;

public class TestSetString {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
				
		String paysMax = "";
		for (String pays : set) {
			if(pays.length() > paysMax.length() ) {
				paysMax = pays;
			}
		}
		set.remove(paysMax);
		System.out.println(set);
	}
}
