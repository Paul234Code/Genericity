package com.genericty.java;

import java.util.Objects;

public class Solo<T> {
	// attributs de la classe
	private T valeur;
	// constructeur par defaut
	public Solo(){
		this.valeur= null;
		
	}
	// constructeur avec parametre
	public Solo( T pvaleur) {
		this.valeur= pvaleur;
	}
	public T getValeur() {
		return valeur;
	}
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.valeur);
	}
	
	@Override
	public String toString() {
		return "Solo [valeur=" + getValeur() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Solo))
			return false;
		Solo other = (Solo) obj;
		return Objects.equals(this.valeur, other.valeur);
	}
	

}
