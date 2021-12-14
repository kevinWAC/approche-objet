package fr.diginamic.operations;

public class Operations {
	
	public double calcul(double a, double b, char operateur) {
		double total = 0;
		
		switch(operateur) {
		case '+':
			total = a + b;
			break;
		case '-':
			total = a - b;
			break;
		case '*':
			total = a * b;
			break;
		case '/':
			total = a / b;
			break;
		}
		return total;
	}
}
