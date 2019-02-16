package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio04NotaBimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite seu nome completo: ");
		String aluno = scan.nextLine();
		
		System.out.print("Digite sua primeiro nota: ");
		float nota1 = scan.nextFloat();
		System.out.print("Digite sua segunda nota: ");
		float nota2 = scan.nextFloat();
		System.out.print("Digite sua terceira nota: ");
		float nota3 = scan.nextFloat();
		System.out.print("Digite sua quarta nota: ");
		float nota4 = scan.nextFloat();
		
		float media;
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf ("Caro aluno(a) " + aluno + " sua média bimestral é %.2f ", media);
	
	}

}

