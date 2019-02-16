package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe21MediaDeAlunosPorTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int classes= 0,
			soma = 0,
			media = 0,
			alunos = 0;
		
		System.out.print("Digite quantas classes há na escola: ");
		classes = scan.nextInt();
		
		for (int i = 1; i <= classes; i ++ ) {
			
			System.out.println(i + "° classe, quantos alunos: ");
			alunos = scan.nextInt();
			
			soma += alunos;
			media += ((soma/classes)/i);
			
			if (alunos > 40) {
				System.out.println("Quantidade de alunos inválida, digite novamente: ");
				alunos = scan.nextInt();
			}
		}
			System.out.println("");
			System.out.println("Média de alunos por sala :" + media);
	}

}
