package com.cleiton.cursojava.aula20Mexercicios;

import java.util.Random;

public class Exe02Matriz10x10ValoresAleatoriosMaiorEMenorParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Indique qual é o maior e o menor valor, da linha 5. E qual é o maior e o
		 * menor valor da coluna 7.
		 */

		int[][] numerosMatrizes = new int[10][10];
		Random numeroRandom = new Random();

		for (int i = 0; i < numerosMatrizes.length; i++) {
			for (int j = 0; j < numerosMatrizes[i].length; j++) {
				numerosMatrizes[i][j] = numeroRandom.nextInt(10);
			}
		}
		for (int i = 0; i < numerosMatrizes.length; i++) {
			for (int j = 0; j < numerosMatrizes[i].length; j++) {
				System.out.print(numerosMatrizes[i][j] + " - ");
			}
			System.out.println("");
		}
		int maiorLinha = 0;
		int menorLinha = 0;
		int linha5 = 5;
		for (int i = 0; i < numerosMatrizes[linha5].length; i++) {
			for (int j = 0; j < numerosMatrizes[i].length; j++) {
				if (numerosMatrizes[linha5][i] > maiorLinha) {
					maiorLinha = numerosMatrizes[linha5][i];
				}
				if (numerosMatrizes[linha5][j] < menorLinha) {
					menorLinha = numerosMatrizes[linha5][j];
				}
			}
		}
		System.out.println("Maior valor da linha 5: " + maiorLinha);
		System.out.println("Menor valor da linha 5: " + menorLinha);
		System.out.println("");

		int maiorColuna = 0;
		int menorColuna = 0;
		int coluna7 = 7;
		for (int i = 0; i < numerosMatrizes.length; i++) {
			if (numerosMatrizes[i][coluna7] > maiorColuna) {
				maiorColuna = numerosMatrizes[i][coluna7];
			}
			if (numerosMatrizes[i][coluna7] < menorColuna) {
				menorColuna = numerosMatrizes[i][coluna7];
			}

		}
		System.out.println("Maior valor da coluna 7: " + maiorColuna);
		System.out.println("Menor valor da coluna 7: " + menorColuna);
		System.out.println("");
		
	}

}
