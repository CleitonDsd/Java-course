package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe3Aluno {

	Scanner scan = new Scanner(System.in);
	String nome, nomeCurso, matricula;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];

	// <>Pega Dados do aluno para verifica��o de notas<>'
	void pegarDados() {
		System.out.println("========= Insira os Dados Abaixo ========");
		System.out.println();

		System.out.println("Nome do Aluno: ");
		nome = scan.nextLine();
		System.out.println("Nome do Curso: ");
		nomeCurso = scan.nextLine();
		System.out.println("Matricula: ");
		matricula = scan.nextLine();

		System.out.println("");

		/*
		 * for (int i = 0; i < disciplinas.length; i++) { System.out.println(i +
		 * "� disciplina nome: "); disciplinas[i] = scan.nextLine(); } // Mostrar a a
		 * disciplina e pedir a nota for (int i = 0; i < disciplinas.length; i++) { for
		 * (int j = 0; j < notas.length; j++) { System.out.println(i + "� disciplina: "
		 * + disciplinas[i] + ", digite a nota: "); notas[j] = scan.nextDouble();
		 * 
		 * soma += notas[j]; } media = soma / 3; } }
		 */

		// <>Pegar nome e obter notas das disciplinas'<>
		for (int i = 0; i < nomeDisciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina " + i);
			nomeDisciplinas[i] = scan.next();
		}

		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.println("Insira a nota " + (j + 1));
				notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
	}

	// <>Exibe dados do Aluno e em seguida Sua m�dia e notas'<>
	void exibirInformacoes() {
		System.out.println("========= Dados do Aluno ========");
		System.out.println();

		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		System.out.println("");
		
		for (int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println("");
		}

	}

	// <>Verifica a aprova��o do Aluno >= 7 est� aprovado == return true'<>
	boolean verificarAprovacao(int indice) {

		if (obterMedia(indice) >= 7) {
			return true;
		}

		return false;
	}

	// <>Obt�m a m�dia do aluno atrav�s do indice (linha) da mat�ria em que se
	// encontra'<>
	double obterMedia(int indice) {

		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;

		return media;
	}

	// <>Verifica a situa��o do aluno caso ele seja aprovado'<>
	void situacaoAluno() {
		System.out.println("============ SITUA��O ============");
		System.out.println();
		for (int i = 0; i < nomeDisciplinas.length; i++) {
			if (verificarAprovacao(i)) {
				System.out.println("Disciplina " + nomeDisciplinas[i] + " - situa��o: Aprovado");
				System.out.println("_____________________________________");
			} else {
				System.out.println("Disciplina " + nomeDisciplinas[i] + " - situa��o: Reprovado");
				System.out.println("_____________________________________");
			}
		}
	}

	/**
	 * void exibirDados() {
	 * 
	 * if (media >= 7) {
	 * 
	 * System.out.println("Aluno: " + nome + "\nCurso: " + curso + "\nMatricula: " +
	 * matricula + "\nM�dia: " + media + "\nSitua��o: Aprovado"); } else if (media <
	 * 7) {
	 * 
	 * System.out.println("Aluno: " + nome + "\nCurso: " + curso + "\nMatricula: " +
	 * matricula + "\nM�dia: " + media + "\nSitua��o: Reprovado"); }
	 * 
	 * }
	 **/
}
