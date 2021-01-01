package com.genericty.java;

public class NumeroIdentificationException extends Exception{
	public NumeroIdentificationException(int numero) {
		System.out.println("Numero identification nul  ou negatif => "+ numero);
		
	}

}
