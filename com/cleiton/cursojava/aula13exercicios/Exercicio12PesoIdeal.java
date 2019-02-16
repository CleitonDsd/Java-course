package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio12PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //Variavel para ler Dados( Entrada de Dados)
		System.out.print("Digite sua Altura: ");
		float altura = scan.nextFloat();
		System.out.print("Digite seu Peso: ");
		float peso = scan.nextFloat();
		
		float pesoIdeal;
		pesoIdeal = (float) ((peso*altura)-58);
		
		System.out.println("Peso Ideal: " + pesoIdeal);
		

	}

}
