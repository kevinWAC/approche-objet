package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		
		for (int i = 1; i <= 1; i++)
		{
			for(int j = 0; j <= liste1.size() - 1; j++) {
				liste3.add(liste1.get(j));
			}
			for(int k = 0; k <= liste2.size() - 1 ; k++) {
				liste3.add(liste2.get(k));		
			}
		}
		System.out.println(liste3);
	}
}
