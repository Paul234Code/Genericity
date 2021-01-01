package com.genericty.java;
import java.util.List ;
import java.util.ArrayList;


public class Garage{
	//attribut de la classe garage
	List<Voiture> liste_voiture= new ArrayList<Voiture>();
	// methode de la classe Garage
	public void add( List<? extends Voiture> liste) {
		for ( Voiture str : liste)
			liste_voiture.add(str);
		
	}
	public static void main(String[] args) {
		Garage garage = new Garage();
		// creation d'une liste de voiture
		List<Voiture> liste_voiture= new ArrayList<Voiture>();
		// ajout d'objects de type voiture dans la liste
		liste_voiture.add(new Voiture("BMW","blue",230d));
		liste_voiture.add(new Voiture("GMD","Red",230d));
		liste_voiture.add(new Voiture("MAZDA","Dark grey",230d));
		liste_voiture.add(new Voiture("KIA","blue",230d));
		
		// creation d'une liste de voiture sans permis
		List<VoitureSansPermis> liste_voiture_sanspermis= new ArrayList<VoitureSansPermis>();
		// ajout d'objects de type voiture sans permis
		
		liste_voiture_sanspermis.add(new VoitureSansPermis("PEUGEOT","white",240d,"PERMI2345678"));
		liste_voiture_sanspermis.add(new VoitureSansPermis("TOYOTA","blue",240d,"PERMI2345678"));
		liste_voiture_sanspermis.add(new VoitureSansPermis("NISSAN","Dark",240d,"PERMI2345678"));
		liste_voiture_sanspermis.add(new VoitureSansPermis("HYNDAY","Green",240d,"PERMI2345678"));
		liste_voiture_sanspermis.add(new VoitureSansPermis("FORD","Red",240d,"PERMI2345678"));
		// copie des listes voitures et voitures sans permis dans l'ogbject garage
		garage.add(liste_voiture);
		garage.add(liste_voiture_sanspermis);
		System.out.println("Affichage de notre garage :");
		System.out.println();
		for (Object v : garage.liste_voiture)
			System.out.println(v.toString());
	}
	

	

}
