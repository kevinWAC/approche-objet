package fr.diginamic.entites;

public class Theatre {
	String nom;
//	final int nbPersonneMax = 100;
	final int NB_PERSONNE_MAX = 100;
	int totalClientsInscrit;
	double totalRecetteEtablissement;
	
	public void inscrire(int nbrClient, double prix) {
		double totalRecette = 0;
		totalClientsInscrit += nbrClient;
		if (totalClientsInscrit < NB_PERSONNE_MAX) {
			totalRecette = nbrClient * prix;
			totalRecetteEtablissement += totalRecette;
			System.out.println("Total clients inscrit: " + totalClientsInscrit);
			System.out.println("Total de la recette: " + totalRecetteEtablissement);
		} else {
			System.err.println("Nombre de personne max atteint !!!");
		}
	}
}
