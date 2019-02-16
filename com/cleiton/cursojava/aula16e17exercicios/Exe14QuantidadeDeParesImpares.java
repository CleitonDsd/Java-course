package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe14QuantidadeDeParesImpares {

		public static void main (String [] args) {
			
			Scanner scan = new Scanner (System.in);
			
			int numeros, totImp = 0, totPar = 0; 
			
			System.out.println("Digite 10 valores inteiros");
			System.out.println("");
			
			for (int i = 1; i <= 10; i++) {								
				
				System.out.print(i + "°. número: ");
				numeros = scan.nextInt();
				
				
				
				if (numeros % 2 == 0) {
					System.out.println(" - Par");
					totPar++;
				}
				else if (numeros % 2 == 1) {
					System.out.println(" - Impar");
					totImp ++;
				}
				
				
			}

			System.out.println("Foram inserido " + totPar + " números Pares ");
			System.out.println("Foram inserido " + totImp + " números Impares ");
	
		}
}
