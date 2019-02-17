package com.cleiton.cursojava.aula27_25Exercicios;

public class Exe1Lampada {

	// Classe do exercicio número 1 - Lampadas

	boolean ligada;

	String ligarLampada() {
		System.out.println(" ON ");
		ligada = true;
		System.out.println("metódo 'ligarLampada' \n");
		return "Lampada Ligada " + ligada;

	}

	String desligarLampada() {
		System.out.println("");

		System.out.println(" OFF ");
		ligada = false;
		System.out.println("metódo 'desligarLampada' \n");

		return "Lampada Desligada " + ligada;
	}

}
