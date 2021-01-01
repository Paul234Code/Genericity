package com.genericty.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanciation des object String avec le constructeur par defaut et avec parametre
		Solo<String> chaine= new Solo<String>();
		System.out.println( chaine.getValeur());
		// constructeur avec parametre
		Solo<String> str= new Solo<String>("bonjour paul");
		System.out.println(str.toString());
		
		// instaciation des objects integer
		System.out.println("instaciation des objects integer:");
		     // constructeur par defaut
		Solo<Integer> entier1= new Solo<Integer>();
		System.out.println(entier1);
		     // constructeur avec parametre
		Solo<Integer> entier2 = new Solo<Integer>(234);
		System.out.println(entier2);
		// instanciation des objects de type Double
		    // construteur par defaut
		System.out.println("instanciation des objects de type Double :");
		Solo<Double> double1 = new Solo<Double>();
		// constructeur avec parametre
		Solo<Double> double2 = new Solo<Double>(235.0);
		System.out.println(double1);
		System.out.println(double2);
		// utilisation de la classe Duo
		Duo<Integer,String> etudiant1= new Duo<Integer,String>();
		System.out.println(etudiant1);
		Duo<Integer,String> etudiant2 = new Duo<Integer,String>(34,"Paul","Faye");
		System.out.println(etudiant2);
		// genercite avec les collections
		//object generique
		List<? extends Voiture> liste= new ArrayList<VoitureSansPermis>();
		// creation d'objects voitures
		
		Voiture V1= new Voiture("BMW","black", 260d);
		Voiture V2 =new Voiture("GMD","Red",230d);
		Voiture V3= new Voiture("PEUGEOT","white",250d);
		Voiture V4= new Voiture("NISSAN","Dark grey",300d);
		// creation d'object voiture sans permis
		
		VoitureSansPermis VSP1= new VoitureSansPermis("PEUGEOT","white",240d,"PERMI2345678");
		VoitureSansPermis VSP2= new VoitureSansPermis("FORD","Red",240d,"PERMI2345678");
		VoitureSansPermis VSP3 = new VoitureSansPermis("TOYOTA","blue",240d,"PERMI2345678");
		VoitureSansPermis VSP4 = new VoitureSansPermis("NISSAN","Dark",240d,"PERMI2345678");
		//ajout des elements dans la liste 
		

	}
	static void affiche(List<? extends Voiture> list){
	
	for(Voiture v : list)
	System.out.print(v.toString());
}

}
