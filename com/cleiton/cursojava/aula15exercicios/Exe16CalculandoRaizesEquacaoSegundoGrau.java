package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe16CalculandoRaizesEquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		//A , B, C, da Equacao de Segundo Grau
		
		System.out.println("Insira o valor de A: ");
		double a = scan.nextDouble();
		if ( a == 0) {
			System.out.println(" A = 0 , não é equação de 2° Grau.");
		}else {
		
		System.out.println("Insira o valor de B: ");
		double b = scan.nextDouble();
		
		
		System.out.println("Insira o valor de C: ");
		double c = scan.nextDouble();
		
		double delta, x1, x2; //X = raiz >>> formula Bhaskára 
		
		
		delta =  ((((b*b) - 4 )* a) * c);
		
		x1 = ((-b + Math.sqrt(delta)/2)*a);
		x2 = ((-b - Math.sqrt(delta)/2)*a);;
		
		if (delta == 0 ) {
			System.out.printf("Delta = 0 ,  possui uma raiz real: %.2f%n " , x1);
		}	
		else if (delta > 0 ) {
			System.out.println("Delta positivo, possui duas raizes reais.");
			System.out.printf(" X¹: %.2f%n " , x1);
			System.out.printf("X²: %.2f%n " , x2);
		}	
		else if (delta < 0 ) {
			System.out.printf("Delta negativo, não possui raizes reais: %.2f%n" , delta);
		}	
		
		}
    }	
}
