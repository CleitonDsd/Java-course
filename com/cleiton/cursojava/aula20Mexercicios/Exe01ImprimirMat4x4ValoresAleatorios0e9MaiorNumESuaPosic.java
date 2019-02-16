package com.cleiton.cursojava.aula20Mexercicios;

import java.util.Random;

public class Exe01ImprimirMat4x4ValoresAleatorios0e9MaiorNumESuaPosic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numerosAleatorios = new int[4][4];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
			}
		}
		int maior = 0;
		int linha = 0;
		int col = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Imprimindo resultados Usando FOR ");
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.println(numerosAleatorios[i][j] +  " - ");
			}
			System.out.println("");
		}
		
		
		System.out.println("Imprimindo resultados Usando for each");
		
		for (int [] numeroAleatorio : numerosAleatorios) {
			for(int numero : numeroAleatorio) {
				System.out.println(numero + " ");
			}
			System.out.println();
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);

	}

}
