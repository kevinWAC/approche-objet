package fr.diginamic.banque.entites;

/** Liste les méthodes obligatoire que doit posséder un objet géométrique
 * @author ulreich kévin
 */
public interface ObjetGeometrique {
	/** Retourne le périmètre d'une forme géométrique
	 * @rerun double
	 */
	double perimetre();
	
	/** Retourne la surface
	 * @return double
	 */
	double surface();
}
