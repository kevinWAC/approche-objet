package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		Operations calcul = new Operations();
		double addition = calcul.calcul(10, 10, '+');
		double soustraction = calcul.calcul(10, 10, '-');
		double multiplication = calcul.calcul(10, 10, '*');
		double division = calcul.calcul(10, 10, '/');
		System.out.println(addition);
		System.out.println(soustraction);
		System.out.println(multiplication);
		System.out.println(division);
	}

}
