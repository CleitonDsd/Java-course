package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe29VetAEB10IntVetCJuncaoDosOutrosVet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[3];
		int[] vetorB = new int[vetorA.length]; // pares
		int[] vetorC = new int[vetorA.length]; // impares

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(i + "° posição do vetorA, valor: ");
			vetorA[i] = scan.nextInt();

			vetorC[i] = vetorA[i];
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(i + "° posição do vetorB, valor: ");
			vetorC[i] = scan.nextInt();

			vetorC[vetorA.length + i] = vetorB[i];
		}
		System.out.println("");
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		// Usando For Each
		System.out.println("");
		System.out.println("Usando For Each");
		for (int vetor : vetorA) {
			System.out.println(vetorA + " ");
		}
		System.out.println("");
		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " - ");
		}
		// Usando For Each
		System.out.println("");
		System.out.println("Usando For Each");
		for (int vetor : vetorB) {
			System.out.println(vetorB + " ");
		}
		System.out.println("");
		System.out.println("Vetor C:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " - ");
		}
		// Usando For Each
		System.out.println("");
		System.out.println("Usando For Each");
		for (int vetor : vetorC) {
			System.out.println(vetorC + " ");
		}
	}

}
