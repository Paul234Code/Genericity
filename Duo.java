package com.genericty.java;

import java.util.Objects;

public class Duo<T,S> {
	private T numeroIdentification;
	private S prenom, nom;
	// constructeur par defaut
	public Duo() {
		this.numeroIdentification= null;
		this.nom =null;
		this.prenom=null;
		
	}
	// constructeur avec parametre
	public Duo(T pidentification, S p_nom, S p_prenom)  {
		
		this.numeroIdentification= pidentification;
		this.nom = p_nom;
		this.prenom= p_prenom;
		
	}
	public T getNumeroIdentification() {
		return numeroIdentification;
	}
	public S getPrenom() {
		return prenom;
	}
	public S getNom() {
		return nom;
	}
	public void setNumeroIdentification(T numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}
	public void setPrenom(S prenom) {
		this.prenom = prenom;
	}
	public void setNom(S nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Duo [numeroIdentification=" + numeroIdentification + ", prenom=" + prenom + ", nom=" + nom
				+ ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom, numeroIdentification, prenom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Duo))
			return false;
		Duo other = (Duo) obj;
		return Objects.equals(nom, other.nom) && Objects.equals(numeroIdentification, other.numeroIdentification)
				&& Objects.equals(prenom, other.prenom);
	}

}
