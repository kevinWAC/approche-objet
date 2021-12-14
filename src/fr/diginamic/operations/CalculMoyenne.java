package fr.diginamic.operations;
import java.util.Arrays;

public class CalculMoyenne {
	double[] arr = new double[0];
	
	public void ajout(double nombre) {
		int longueur = arr.length;
		arr = Arrays.copyOf(arr, longueur + 1);
		arr[longueur] = nombre;
		System.out.println(Arrays.toString(arr)); 
	}
	
	public void calcul() {
		double total = 0;
		for(double nombre: arr) {
			total += nombre;
		}
		int longueur = arr.length;
		System.out.println(total/longueur);
	}
}
