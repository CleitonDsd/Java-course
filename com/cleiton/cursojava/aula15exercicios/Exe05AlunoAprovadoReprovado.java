package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe05AlunoAprovadoReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno(a): ");
		String nomeAluno = scan.nextLine();
		
		System.out.println("Insira a nota do primeiro bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Insira a nota do segundo bimestre: ");
		double nota2 = scan.nextDouble();
		System.out.println("Insira a nota do terceiro bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.println("Insira a nota do quarto bimestre: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >=7){
			System.out.println("Aluno (a) " + nomeAluno + " Aprovado.");
		}
		else if (media <7){
			System.out.println("Aluno (a) " + nomeAluno + " Reprovado.");
		}
		else if (media ==10){
			System.out.println("Aluno (a) " + nomeAluno + " Aprovado com Distinção.");
		}

	}

}
