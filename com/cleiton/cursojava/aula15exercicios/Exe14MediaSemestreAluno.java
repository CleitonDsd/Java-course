package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe14MediaSemestreAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu nome completo: ");
		String aluno = scan.nextLine();
		
		System.out.println("Insira a primeira nota do semestre: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Insira a segunda nota do semestre: ");
		double segundaNota = scan.nextDouble();
		
		double media = (primeiraNota + segundaNota)/2;
		
		if (media >= 0 && media <= 4) {
			System.out.println("Aluno(a): " + aluno);
			System.out.println("Média : " + media);
			System.out.println("Conceito: E");
			System.out.println("Situação: Reprovado");
		}
		else if (media >= 4.0 && media <= 6) {
				System.out.println("Aluno(a): " + aluno);
				System.out.println("Média : " + media);
				System.out.println("Conceito: D");
				System.out.println("Situação: Reprovado");	
		}
		else if (media >= 6.0 && media <= 7.5) {
			System.out.println("Aluno(a): " + aluno);
			System.out.println("Média : " + media);
			System.out.println("Conceito: C");
			System.out.println("Situação: Aprovado");	
	    }
		else if (media >= 7.5 && media <= 9.0) {
			System.out.println("Aluno(a): " + aluno);
			System.out.println("Média : " + media);
			System.out.println("Conceito: B");
			System.out.println("Situação: Aprovado");	
	    }
		else if (media >= 9.0 && media <= 10.0) {
			System.out.println("Aluno(a): " + aluno);
			System.out.println("Média : " + media);
			System.out.println("Conceito: A");
			System.out.println("Situação: Aprovado");	
	    }
		else 
			System.out.println("Valor Inválido");
		}
	}


