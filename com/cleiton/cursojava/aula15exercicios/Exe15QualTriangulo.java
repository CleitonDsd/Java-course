package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe15QualTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("TRIÂNGULOS");
		System.out.println("Insira o Primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Insira o Segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Insira o Terceiro lado: ");
		double lado3 = scan.nextDouble();
	
		//Três Lados iguais Triangulo Equilatero
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Área: Três lados iguais");
			System.out.println("Tipo: Triângulo Equilatero");
		}
		//Três lados diferentes Triangulo Escaleno
		
		else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("Área: Três lados diferentes");
			System.out.println("Tipo: Triângulo Escaleno");
		}
		//Três lados diferentes Triangulo Escaleno
		
		else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Área: Dois lados iguais");
			System.out.println("Tipo: Triângulo Isósceles");
		}
		else if (lado2 == lado3 && lado3 != lado1) {
			System.out.println("Área: Dois lados iguais");
			System.out.println("Tipo: Triângulo Isósceles");
		}
		else if (lado3 == lado1 && lado1 != lado2) {
			System.out.println("Área: Dois lados iguais");
			System.out.println("Tipo: Triângulo Isósceles");
		}
	}

}
