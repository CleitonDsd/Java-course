package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe13DiaSemanaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite um numero que equivale ao um dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1 : System.out.println(" '1' Domingo, Primeiro dia da semana"); 
				 System.out.println("Fim de Semana"); break;
		case 2 : System.out.println(" '2' Segunda, Segundo dia da semana"); break;
		case 3 : System.out.println(" '3' Terça, Terceiro dia da semana"); break;
		case 4 : System.out.println(" '4' Quarta, Quarto dia da semana"); break;
		case 5 : System.out.println(" '5' Quinta, Quinto dia da semana"); break;
		case 6 : System.out.println(" '6' Sexta, Sexto dia da semana"); break;
		case 7 : System.out.println(" '7' Sábado, Sétimo dia da semana"); 	
				 System.out.println("Fim de Semana"); break;
			
		default: System.out.println("Dia Inválido"); break;
		}
		
	}

}
