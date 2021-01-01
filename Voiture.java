package com.genericty.java;

import java.util.Objects;

public class Voiture {
	protected String marque;
	protected String color;
	protected double masse;
	/**
	 * 
	 */
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param marque
	 * @param color
	 * @param masse
	 */
	public Voiture(String marque, String color, double masse) {
		super();
		this.marque = marque;
		this.color = color;
		this.masse = masse;
	}
	@Override
	public String toString() {
		return   getMarque() + " --- " + getColor() + "  --- " + getMasse() + " --- "+
				hashCode();
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, marque, masse);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Voiture))
			return false;
		Voiture other = (Voiture) obj;
		return Objects.equals(color, other.color) && Objects.equals(marque, other.marque)
				&& Double.doubleToLongBits(masse) == Double.doubleToLongBits(other.masse);
	}
	public String getMarque() {
		return marque;
	}
	public String getColor() {
		return color;
	}
	public double getMasse() {
		return masse;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMasse(double masse) {
		this.masse = masse;
	}

}
