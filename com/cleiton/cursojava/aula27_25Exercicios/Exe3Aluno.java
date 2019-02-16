package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe3Aluno {

	Scanner scan = new Scanner(System.in);
	String nome, curso;
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
	double media, soma;
	int matricula;

	void pegarDados() {

		System.out.println("Nome do Aluno: ");
		nome = scan.nextLine();
		System.out.println("Nome do Curso: ");
		curso = scan.nextLine();
		System.out.println("");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println(i + "° disciplina nome: ");
			disciplinas[i] = scan.nextLine();
		}
		// Mostrar a a disciplina e pedir a nota
		for (int i = 0; i < disciplinas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				System.out.println(i + "° disciplina: " + disciplinas[i] + ", digite a nota: ");
				notas[j] = scan.nextDouble();

				soma += notas[j];
			}
			media = soma / 3;
		}
	}

	void exibirDados() {

		if (media >= 7) {

			System.out.println("Aluno: " + nome + "\nCurso: " + curso + "\nMatricula: " + matricula + "\nMédia: "
					+ media + "\nSituação: Aprovado");
		} else if (media < 7) {

			System.out.println("Aluno: " + nome + "\nCurso: " + curso + "\nMatricula: " + matricula + "\nMédia: "
					+ media + "\nSituação: Reprovado");
		}

	}
}
