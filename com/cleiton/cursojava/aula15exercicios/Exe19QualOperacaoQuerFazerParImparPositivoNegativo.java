package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe19QualOperacaoQuerFazerParImparPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Insira dois valores");
		System.out.print("Primeiro Valor:");
		double primeiroValor = scan.nextDouble();
		System.out.print("Segundo Valor:");
		double segundoValor = scan.nextDouble();
		
		System.out.println("Deseja verificar se é Par ou Impar (p) ou Positivo ou Negativo (o)");
		char resposta;
		resposta = scan.next().charAt(0);
		
		//PAR OU IMPAR
		
		if (resposta == 'p' ) {
		
		if  (primeiroValor % 2 == 0) {
			System.out.println("Primeiro valor: Par");
			}
		else if  (primeiroValor % 2 == 1) {  
			System.out.println("Primeiro valor: Impar");	
		}
		
		if  (segundoValor % 2 == 0) {  
			System.out.println("Segundo valor: Par");
		}
		else if  (segundoValor % 2 == 1) {  
			System.out.println("Segundo valor: Impar");
		} }
		
		
		//Positivo ou Negativo
		
		
		else if (resposta == 'o' ) {
			
		if  (primeiroValor >= 0) {
			System.out.println("Primeiro valor: Positivo");
		}
		else if  (primeiroValor <= 0) {  
			System.out.println("Primeiro valor: Negativo");
		}
		if  (segundoValor >= 0) {  
			System.out.println("Segundo valor: Positivo");
		}
		else if  (segundoValor <= 0) {  
			System.out.println("Segundo valor: Negativo"); 
		}//Caracatere for diferente 'p' e 'o', programa não será executado
		else if (resposta != 'p' && resposta != 'o') { 
			System.out.println("Caractere Inválido");
		}
			}
		
	}

}
	
