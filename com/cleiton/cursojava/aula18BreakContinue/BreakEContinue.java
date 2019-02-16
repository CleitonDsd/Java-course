package com.cleiton.cursojava.aula18BreakContinue;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**	Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		System.out.println("Digite o Limite: ");
		int maximo = scan.nextInt();	
		
		for (int i = numero; i <= maximo; i ++) {
			if (i % 7 == 0) {
				System.out.println(" Valor de i : " + i);
				break;
			}
		}
			
	}

} **/
		for (int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;						
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;								
					}
					System.out.println("rotulo 3");
				}
				System.out.println("rotulo 2");
			}
		System.out.println("rotulo 1");
		}
		System.out.println(i);
	}
		
	}
}
