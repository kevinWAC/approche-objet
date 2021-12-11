package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte(155431, 3200);
		System.out.println(compte); // fr.diginamic.banque.entites.Compte@3d012ddd
		System.out.println(compte.numeroCompte); // 155431
		System.out.println(compte.soldeCompte); // 3200
	}
}
