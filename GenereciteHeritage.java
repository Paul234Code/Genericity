package com.genericty.java;
import java.util.List;
import java.util.ArrayList;

public class GenereciteHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// liste d'object voitures
		
		// liste n'acceptant que des objects de type voiture et de ses claases derivees
		List< ? extends Voiture> listeVoiture_sp = new ArrayList< VoitureSansPermis>();
		//listeVoiture_sp.add(new Voiture("BMW","red",240d));  impossible d'ajouter un element a la liste
		// apres la wildcard : ?
		// affichage de la liste
		afficher(listeVoiture_sp);
		// creation d'une liste de voiture
		List<Voiture> voiture = new ArrayList<Voiture>();
		    // ajout d'object voiture dans la liste
		
		voiture.add(new Voiture("BMW","blue",230d));
		voiture.add(new Voiture("BMW1","blue",230d));
		voiture.add(new Voiture("BMW2","blue",230d));
		voiture.add(new Voiture("BMW3","blue",230d));
		voiture.add(new Voiture("BMW4","blue",230d));
		voiture.add(new Voiture("BMW5","blue",230d));
		voiture.add(new Voiture("BMW6","blue",230d));
		
		// creation d'une liste de voiture avec permis
		List<VoitureSansPermis> voiture_sans_permis= new ArrayList<VoitureSansPermis>();
		
		  //ajout d'objects  de voiture sans permis
		
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		voiture_sans_permis.add(new VoitureSansPermis("GMD","white",240d,"PERMI2345678"));
		
		System.out.println("Affichage de liste des voitures:");
		afficher(voiture);
		System.out.println();
		System.out.println("Affichage de liste des voitures sans permis:");
		afficher(voiture_sans_permis);
		
		// creation d'une liste d'object de la superclasse Object de voiture
		
		List<Object> liste_Object = new ArrayList<Object>();
	    // ajout d'objects Object de la liste
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		liste_Object.add( new Object());
		System.out.println("Affichage de liste d'Object avec la methode afficher2()");
		afficher2(liste_Object);
		System.out.println();
		System.out.println("affichage de la liste de voiture avec la methode afficher2()");
		afficher2(voiture);

		
 
	}
	// methode qui permet de parcourir les liste de type voiture et les listes de type VoitureSansPermis
	static void afficher(List<? extends Voiture > listeVoiture_sp) {
		for( Voiture V : listeVoiture_sp)
			System.out.println(V.toString());
	}
	// permettant d'accepter n'importe quel Object de type de liste de la super classe de la classe voiture
	static void afficher2( List<? super Voiture> listevoiture) {
		for (Object v : listevoiture)
			System.out.println(v.toString());
	}

}
