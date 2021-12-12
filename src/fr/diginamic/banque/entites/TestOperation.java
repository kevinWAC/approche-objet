package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = {
			new Credit("10/12/2021", 1000),
			new Debit("09/11/2021", 500),
			new Credit("01/12/2021", 1000),
			new Debit("15/11/2021", 500),
			new Credit("01/12/2021", 1000),
			new Debit("18/11/2021", 500),
			new Credit("05/12/2021", 1000),
			new Debit("16/11/2021", 300.15F)
		};
		float montantTotal = 0;
		for (Operation operation : operations) {
			System.out.println(operation + "\n" + operation.getType());
			if(operation.getType() == "CREDIT") {
				montantTotal += operation.montant;
			} else {
				montantTotal -= operation.montant;
			}
		}
		System.out.println("Montant Tolal: " + montantTotal);
	}

}
