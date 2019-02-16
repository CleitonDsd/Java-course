package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe10VetorACom10IntVetBComRestoDivsaoPor2doVetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [10];
		
		System.out.println("Insira os valores do Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + "° posição do vetor, valor: ");
			vetorA[i] = scan.nextInt();
						
		}
		System.out.println(" ");
		System.out.println("Vetor B = Vetor A % 2 ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i]%2;
			System.out.println(i + "° posição do vetor, valor: " + vetorB[i]);	
		}
		
		 

	}

}
