package fr.diginamic.banque.entites;

public class Compte {
	public int numeroCompte;
	public int soldeCompte;
	
	public Compte(int numeroCompte, int soldeCompte ) {
		 this.numeroCompte = numeroCompte;
		 this.soldeCompte = soldeCompte;
	}
		 public String toString() {
			 return "Numero compte : " + this.numeroCompte + "\nSolde compte : " + this.soldeCompte;
				    
	}
	
	
	
}
