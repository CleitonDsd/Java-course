package com.cleiton.cursojava.aula20Mexercicios;

import java.util.Scanner;

public class Exe03Matriz3x3ImprimirMatrizComQtdDeParesEImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Número: ");
				numeros[i][j] = scan.nextInt();
			}
		}
		System.out.println("");
		System.out.println("Matriz:");
		System.out.println("");

		int qtdPares = 0, somaPares = 0;
		int qtdImpares = 0, somaImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 == 0) {
					somaPares += numeros[i][j];
					qtdPares++;
				} else {
					somaImpares += numeros[i][j];
					qtdImpares++;
				}
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Quantidade de números impares: " + qtdImpares + ". Total de impares: " + somaImpares);
		System.out.println("Quantidade de números pares: " + qtdPares + ". Total de pares: " + somaPares);
	}

}
