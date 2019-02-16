package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe09TresNumerosOrdemDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double n1 = scan.nextDouble(); //N1 = primeiro numero
		System.out.println("Digite o primeiro numero: ");
		double n2 = scan.nextDouble(); //N2 = segundo numero
		System.out.println("Digite o primeiro numero: ");
		double n3 = scan.nextDouble(); //N3 = terceiro numero

		if (n1 > n2  && n2> n3) {
			System.out.println (n1);
			System.out.println (n2);
			System.out.println (n3);
		}
		else if (n1 > n3  && n3> n2) {
			System.out.println (n1);
			System.out.println (n3);
			System.out.println (n2);
		}
		else if (n2 > n1  && n1> n3) {
			System.out.println (n2);
			System.out.println (n1);
			System.out.println (n3);
		}
		else if (n2 > n3  && n3> n1) {
			System.out.println (n2);
			System.out.println (n3);
			System.out.println (n1);
		}
		else if (n3 > n1  && n1> n2) {
			System.out.println (n3);
			System.out.println (n1);
			System.out.println (n2);
		}
		else if (n3 > n2  && n2> n1) {
			System.out.println (n3);
			System.out.println (n2);
			System.out.println (n1);
		}
	}

}
