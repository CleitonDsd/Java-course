package com.cleiton.cursojava.aula19exercicios;

import java.util.Scanner;

public class Exe23QualVetNaoEParSeForContinuarSenaoEncerrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];

		/*
		 * for (int i = 0; i < vetor.length; i++) { System.out.print(i +
		 * "� posi��o do vetor, valor: "); vetor[i] = scan.nextInt(); }
		 */
		System.out.println("Insira 10 n�meros, somente n�meros pares!");

		System.out.println("VETORES: ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(i + "� posi��o do vetor, valor: ");
			vetor[i] = scan.nextInt();
			if (vetor[i] % 2 == 0) {

			} else {
				System.out.println(vetor[i] + " � um N�mero Impar, LOOP CANCELADO !!!");
				break;
			}

		}

	}

}
