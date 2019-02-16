package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio10CelsiusParaFarenheit {
	
		public static void main (String [] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Digite a temperetura em Celsius deseja converter: ");
	float celsius = scan.nextFloat();
	float farenheit;
	farenheit = (float) (celsius * 1.8 + 32);
	System.out.printf ("A temperatura em graus Farenheit é %.2f ", farenheit," F");
	
	//T(°F) = T(°C) × 1.8 + 32
	}
}
