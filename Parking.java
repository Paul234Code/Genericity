package com.genericty.java;

import java.util.List;
import java.util.ArrayList;

public class Parking {
	private List<?extends Voiture> parking;
	public Parking() {
		parking = new ArrayList< Voiture>();
	}
	public Parking(List<? extends Voiture> liste) {
		parking= liste;
	}
	
}
