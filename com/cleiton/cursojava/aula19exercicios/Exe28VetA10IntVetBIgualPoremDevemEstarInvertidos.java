package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe28VetA10IntVetBIgualPoremDevemEstarInvertidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primeiro elemento de A passa a ser último de B

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição do vetorA, valor: ");
			vetorA[i] = scan.nextInt();
			
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
		System.out.println("");
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println("");
		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " - ");
		}

	}

}
