package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] comptes = {new Compte(57414845, 1500), new CompteTaux(545,8464,10)};
		
		for (Compte compte:comptes) {
			System.out.println(compte);
		}
	}
}
