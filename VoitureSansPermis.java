package com.genericty.java;

import java.util.Objects;

public class VoitureSansPermis extends Voiture {
	private String numeroPermis;

	/**
	 * 
	 */
	public VoitureSansPermis() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marque
	 * @param color
	 * @param masse
	 */
	public VoitureSansPermis(String marque, String color, double masse,String permis) {
		super(marque, color, masse);
		this.numeroPermis= permis;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		 
		return super.toString() +"---" + getNumeroPermis();
	}

	public String getNumeroPermis() {
		return numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPermis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof VoitureSansPermis))
			return false;
		VoitureSansPermis other = (VoitureSansPermis) obj;
		return Objects.equals(numeroPermis, other.numeroPermis);
	}

	

}
