package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe17AnosBissexto {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
			
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("Insira um ano (Para saber se � Bissexto): ");
		int ano = scan.nextInt();
		
		if (ano % 400 == 0 ) {
			System.out.println(ano + " � um ano Bissexto.");
		}
		else if (ano % 4 == 0 ) {
			System.out.println(ano + " � um ano Bissexto.");
		}
		else {
			System.out.println(ano + "  n�o � um ano Bissexto");
		}
		
	
	}

}
