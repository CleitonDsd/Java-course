package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe26VetorAVetBVetCESuasRegras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Enquanto o vetorA for impar o vetorB deve ser ==0;{ else o vetorB deve ser
		 * ==1.
		 */

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição do vetorA, valor: ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(i + "° posição do vetorB, valor: ");
			vetorB[i] = scan.nextInt();
			
			
			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			}else if (vetorA[i] > vetorB[i]) {
				vetorC[i] =   -1;
			}
			
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
		System.out.println("");
		System.out.println("Vetor C:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " - ");
		}
	}

}
