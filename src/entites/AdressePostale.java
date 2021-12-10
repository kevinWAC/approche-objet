package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostale;
	public String ville;
	
	public AdressePostale( int nvNumeroRue, String nvLibelle, int nvCodePostale, String nvVille) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelle;
		codePostale = nvCodePostale;
		ville = nvVille;
	}
}
