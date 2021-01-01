package com.genericty.java;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class GenereciteCollection {

	public static void main(String[] args) {
		
		// creation d'une liste de chaine de caractere
		ArrayList<String> listeString = new ArrayList<String>();
		listeString.add("Lundi");
		listeString.add("Mardi");
		listeString.add("Mercredi");
		listeString.add("Jeudi");
		listeString.add("Vendredi");
		listeString.add("Samedi");
		listeString.add("Dimanche");
		// affichage de la liste par une boucle for
		for (String str : listeString)
			System.out.print(str + " ");
		// parcours de la liste avec un iterator
		System.out.println("parcours de la liste avec un iterator");
		ListIterator li= listeString.listIterator();
		while (li.hasNext())
			System.out.println(li.next() + "--- "+ li.nextIndex());
		// creation d'une liste de flotant
		List<Float> listefloat= new ArrayList<Float>();
		// creation de liste d'entier
		List<Integer> listeinteger= new ArrayList<Integer>();
		
		
		

	}

}
