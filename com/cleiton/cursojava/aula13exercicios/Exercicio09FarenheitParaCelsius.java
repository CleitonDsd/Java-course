package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio09FarenheitParaCelsius {
	
		public static void main (String [] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Digite a temperetura em Farenheit deseja converter: ");
	float farenheit = scan.nextFloat();
	float celsius;
	celsius = (5*(farenheit-32)/9);
	System.out.printf ("A temperatura em graus Celsius é %.2f ", celsius," C");
	
	
	}
}
