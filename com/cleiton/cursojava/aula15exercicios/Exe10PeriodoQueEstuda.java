package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe10PeriodoQueEstuda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Em que periodo você estuda ((M) - matutino), ((V) - Vespertino), ((N) - Noturno): ");
		char periodo;
		periodo = scan.next().charAt(0);
		
		switch (periodo) {
		case 'M' : System.out.println("Bom Dia!"); break;
		case 'V' : System.out.println("Bom Tarde!"); break;
		case 'N' : System.out.println("Bom Noite!"); break;
		
		case 'm' : System.out.println("Bom Dia!"); break;
		case 'v' : System.out.println("Bom Tarde!"); break;
		case 'n' : System.out.println("Bom Noite!"); break;
		
		default : System.out.println("Valor Inválido."); break;
		}
		

	}

}
