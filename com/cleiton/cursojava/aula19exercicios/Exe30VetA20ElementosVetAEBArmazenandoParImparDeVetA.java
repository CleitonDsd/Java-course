package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe30VetA20ElementosVetAEBArmazenandoParImparDeVetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição do vetorA, valor: ");
			vetorA[i] = scan.nextInt();

		}

		int posicaoB = 0;
		int posicaoC = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			} else {
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}

		}
		System.out.println("");
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		System.out.println("");
		System.out.println("Vetor B:");
		for (int i = 0; i < posicaoB; i++) {
			System.out.print(vetorB[i] + " - ");
		}
		System.out.println("");
		System.out.println("Vetor C:");
		for (int i = 0; i < posicaoC; i++) {
			System.out.print(vetorC[i] + " - ");
		}
	}

}
