package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\ulrei\\Downloads\\recensement.csv");
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
		Path pathDestination = Paths.get("C:\\Users\\ulrei\\Downloads\\recensement2.csv");

		if(estFichier && estLisible) {
			List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
			
			List<Recensement> listeVilles = new ArrayList<>();
			
			for(int ligne = 0; ligne <= lignes.size() - 1; ligne++) {
				String uneLigne = lignes.get(ligne);
				
				String[] ligneSplit = uneLigne.split(";");
				
				Recensement ville = new Recensement();
				ville.setNom(ligneSplit[6]);
				ville.setCodeDepartement(ligneSplit[2]);
				ville.setNbrHabitant(ligneSplit[9]);
				if (ligne > 0) {
					int sup25 = Integer.parseInt(ville.getNbrHabitant().replace(" ", ""));
					if(sup25 < 1000){
						listeVilles.add(ville);
					}
						
				}
			}
			for (Recensement ligneVille : listeVilles) {
				Files.writeString(pathDestination,ligneVille.getNom() + ligneVille.getCodeDepartement() +ligneVille.getNbrHabitant(), StandardOpenOption.APPEND);
			}
		}
	}
}		