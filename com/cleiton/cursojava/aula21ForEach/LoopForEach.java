package com.cleiton.cursojava.aula21ForEach;

import java.util.Random;

public class LoopForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sem For Each

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(i + "° - nota: " + notas[i]);
		}
		
		//Usando o For Each - Exemplo em Array Unidimensional
		
		System.out.println("");
		System.out.println("Usando o For Each");
		
		for (int nota : notas) {
			System.out.println("° - nota: " + nota);
		}
		System.out.println("");
		
		
		//For Each - Exemplo em Array Multidimensional
		

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
		
		for (double [] notaDoAluno : notasAlunos) {
			for(double nota : notaDoAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}

	}
	
}
