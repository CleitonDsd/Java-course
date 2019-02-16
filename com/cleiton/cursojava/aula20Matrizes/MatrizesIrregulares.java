package com.cleiton.cursojava.aula20Matrizes;

import java.util.Scanner;

public class MatrizesIrregulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Matrizes Irregulares, exemplo:
		 * 
		 * Escreva um programa para guardar dados de uma pesquisa feita com uma amostra
		 * de pessoas da av. mais movimentada de onde você mora. A pesquisa consiste em
		 * perguntar ao cidadão a quantidade de filhos eo nome de cada filho. Guarde
		 * essas informações dentro de uma matriz de forma que cada pessoa entrevistada
		 * ocupe somente o espaço necessário na memória para guardar os nomes dos
		 * filhos. Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos
		 * de cada entrevistado e os respectivos nomes dos filhos.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o número de pessoas entrevistadas: ");
		int numeroEntrevistados = scan.nextInt();

		String[][] nomesFilhos = new String[numeroEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {

			System.out.println("Digite a quantidade de filhos: ");
			int quantidadeFilhos = scan.nextInt();

			nomesFilhos[i] = new String[quantidadeFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do " + ((j + 1)) + "° filho");
				nomesFilhos[i][j] = scan.next();
			}
		}
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos.length + " filhos");
			for (int j = 0; j < nomesFilhos.length; j++) {
				System.out.println("nome: " + nomesFilhos[i][j]);
			}
		}
	}

}
