package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe01PedirNumeroEntre0e10AteNumeroInvalido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int numero = 0;
		
		System.out.println("INICIO");
		System.out.println("");
		
		
		
		
		while (numero <=10) {
			System.out.println("Digite um número entre 0 e 10:");
			numero = scan.nextInt();						
			
			if (numero>10 || numero <0) {
				System.out.println("Número Invalido, digite novamente: ");
				numero = scan.nextInt();
				System.out.println("");
				
			}
			
		}
		
		System.out.println("FIM DO PROGRAMA!");
	}

}
