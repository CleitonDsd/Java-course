package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe20DesevendandoCrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Resposdando utilzando Sim (s) ou Não (n).");
		
		System.out.println("Telefonou para a vítima? (s/n) ");
		char pergunta1 = scan.next().charAt(0);
		System.out.println("Esteve no local do crime? (s/n) ");
		char pergunta2 = scan.next().charAt(0);
		System.out.println("Mora perto da vítima? (s/n) ");
		char pergunta3 = scan.next().charAt(0);
		System.out.println("Devia para vítima? (s/n)");
		char pergunta4 = scan.next().charAt(0);
		System.out.println("Já trabalhou com a vítima? (s/n)");
		char pergunta5 = scan.next().charAt(0);
		
		int cont = 0;
		
		/*if (pergunta1=equalsIgnoreCase ("s")) {
			cont++;
		}
		if (pergunta2=equalsIgnoreCase ("s")) {
			cont++;
		}
		if (pergunta3=equalsIgnoreCase ("s")) {
			cont++;
		}	
		if (pergunta4.equalsIgnoreCase ("s")) {
			cont++;
		}
		if (pergunta5=equalsIgnoreCase ("s")) {
			cont++;
		}
		else if (cont == 0) {
			System.out.println("Inocente");
		}
		if (cont ==2 ) {
			System.out.println("Suspeita");
		}
		else if (cont == 3 || cont ==4) {
			System.out.println("Cúmplice");
		}
		else if (cont == 5) {
			System.out.println("Assasino");
		}
		*/

	}

}
