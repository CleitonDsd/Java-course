package com.cleiton.cursojava.aula20Matrizes;

public class AulaDeMatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * < Matrizes funcionam como tabelas >;
		 * 
		 * primeiro colchetes o número de alunos;  segundo colchetes a quantidade de
		 * notas que podem ser armazenadas, no caso 4;
		 * 
		 * meu array de alunos vai do indice 0 á 29, totalizando 30 posições referentes
		 * a alunos; meu array de notas tem total de 4, para cada indice de alunos.
		 */

		double notasAlunos[][] = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.print(notasAlunos[i] + " - "); //Irá imprimir o endereço de
			// memória do vetor
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println("");
		}

		// Para alterar a nota basta:

		notasAlunos[0][0] = 5; // Ao invés de 10, o primeiro aluno teve sua primeira nota alterada para 5;
		System.out.println("");
		System.out.println("1° Nota Alterada");

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Calculando a média de cada aluno");

		double soma;

		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
				soma += notasAlunos[i][j] / 4;
				// Soma todas as notas e divide pela quantidade de notas;
			}
			System.out.println("Média do aluno " + i + " é " + soma);
		}
	}

}
