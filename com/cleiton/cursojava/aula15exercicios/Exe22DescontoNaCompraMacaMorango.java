package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe22DescontoNaCompraMacaMorango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Ma��    Pre�o (Kg): 1,80");
		System.out.println("Morango Pre�o (Kg): 2,50");
		System.out.println("");
		System.out.println("Acima de 5Kg:");
		System.out.println("Ma��    Pre�o (Kg): 2,20");
		System.out.println("Morango Pre�o (Kg): 1,50");
		
		System.out.println("Digite qual Produto voc� deseja comprar Ma�� (c) ou Morango (m)");
		char resposta = scan.next().charAt(0);
		
		System.out.println("Digite quantos Kg voc� deseja comprar: ");
		double kg = scan.nextDouble();
		
		double precoMaca = kg * 1.80;
		double precoMorango = kg * 2.50;
		double desconto; 
		
		if (resposta == 'c' && precoMaca >= 25) {
		    if (kg <=5) {
				System.out.println("Ma�a:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMaca);
				desconto = 0;
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}
		    if  (kg >=5) {
				precoMaca = 1.50;
				System.out.println("Ma�a:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMaca);
				desconto = ((1 - 0.10)*precoMaca);
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}
			if (kg >=8) {
				System.out.println("Ma�a:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMaca);
				desconto = ((1 - 0.10)*precoMaca);
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}	
		}
	
		
		if (resposta == 'm' && precoMorango >= 25) {
			if (kg >=8) {
				System.out.println("Morango:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMorango);
				desconto = ((1 - 0.10)*precoMorango);
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}
			else if  (kg >=6) {
				precoMorango = 2.20;
				System.out.println("Morango:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMorango);
				desconto = ((1 - 0.10)*precoMorango);
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}
			else if (kg <=5) {
				System.out.println("Morango:");
				System.out.printf("Pre�o (R$): %.2f%n" , precoMorango);
				desconto = 0;
				System.out.printf("Pre�o com Desconto (R$): %.2f%n" , desconto);
			}
			
		}

	}

}
