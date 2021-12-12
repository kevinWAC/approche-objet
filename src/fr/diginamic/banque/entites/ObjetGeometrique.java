package fr.diginamic.banque.entites;

/** Liste les m�thodes obligatoire que doit poss�der un objet g�om�trique
 * @author ulreich k�vin
 */
public interface ObjetGeometrique {
	/** Retourne le p�rim�tre d'une forme g�om�trique
	 * @rerun double
	 */
	double perimetre();
	
	/** Retourne la surface
	 * @return double
	 */
	double surface();
}
