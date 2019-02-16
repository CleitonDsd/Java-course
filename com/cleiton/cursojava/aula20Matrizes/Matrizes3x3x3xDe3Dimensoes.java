package com.cleiton.cursojava.aula20Matrizes;

public class Matrizes3x3x3xDe3Dimensoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa com uma matriz de 3 dimensões (3x3x3) onde cada elemento da
		 * matriz seja igual a soma dos seus índices (exemplo: m[1, 2, 1] = 1 + 2+ 1 =
		 * 4).
		 *
		 * Obtenha a soma de todos os elementos da matriz, e obtenha a soma dos
		 * elementos cujo valores são pares e impares; Exibir na tela os valores da soma
		 * total, soma dos pares e soma dos ímpares
		 */

		int[][][] matrizTridimensional = new int[3][3][3];

		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 ==0) {
						somaPares += matrizTridimensional[i][j][k];
					}else {
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		System.out.println("");
		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma impares = " + somaImpares);
	}

}
