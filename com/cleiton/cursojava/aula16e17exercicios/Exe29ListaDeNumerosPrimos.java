package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe29ListaDeNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		
		for (int i = 1; i <= numero ; i++) {
			
			
			
			
			if (numero % i == 0) {
				System.out.println( i+ " >> PRIMO");
				
			}else {
				System.out.println(i + " << NÃO É PRIMO");
				
			}
			
			
		}
		System.out.println("");
		System.out.println("Fim do programa");

	}

}
