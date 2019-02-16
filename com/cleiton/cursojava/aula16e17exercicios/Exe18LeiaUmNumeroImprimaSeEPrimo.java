package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe18LeiaUmNumeroImprimaSeEPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int numero = 1 ;	
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt ();
		
		for (int i =2; i<=numero; numero -- ) {						
			
			if (numero % numero == 0 || numero % 1 == 0) {
				
				System.out.println(numero + ", É número Primo!");				
			}else {
				System.out.println(", Não é divisível por ele mesmo, não é primo");
			}
			
			
		}
	}

}
