package histoire;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;
import villagegaulois.VillageSansChefException;

public class ScenarioCasDegrade {
	public static void main(String[] args) {
		Etal etal = new Etal();
		etal.libererEtal();
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 10);
		Gaulois bonemine = new Gaulois("Bonemine", 2);
		etal.occuperEtal(bonemine, "fleurs", 10);
		
		try {
			etal.acheterProduit(0, abraracourcix);
		} catch (IllegalArgumentException e) {
			System.err.println("Exception attrapée : " + e.getMessage());
		}
		
		Etal etalVide = new Etal();
		try {
			etalVide.acheterProduit(5, abraracourcix);
		} catch (IllegalStateException e) {
			System.err.println("Exception attrapée : " + e.getMessage());
		}
		
		Village village = new Village("Le village sans chef", 10, 2);
		try {
			System.out.println(village.afficherVillageois());
		} catch (VillageSansChefException e) {
			System.err.println("Exception attrapée : " + e.getMessage());
		}

		System.out.println("Fin des tests des cas dégradés.");
		}

}
