package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio08TotalSalarioMensal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Informe quanto voc� ganha por hora: ");
		float salarioHora = scan.nextFloat();
		
		System.out.print("Insira suas horas trabalhadas: ");
		float horaTrabalhada = scan.nextFloat();
		
		float total;
		total = salarioHora*horaTrabalhada; //Calculo para saber o total no m�s
		
		System.out.println("Seu salario total referido no m�s equivale � " + total + " reais");
		
		
		
		
		

	}

}
