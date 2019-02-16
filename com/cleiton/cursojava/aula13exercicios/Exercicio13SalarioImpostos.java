package com.cleiton.cursojava.aula13exercicios;

import java.util.Scanner;

public class Exercicio13SalarioImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe quanto você ganha por hora: ");
		float salarioHora = scan.nextFloat();
		
		System.out.print("Insira suas horas trabalhadas: ");
		float horaTrabalhada = scan.nextFloat();
		
		float total1; //Corresponde a Salario Bruto no mês
		total1 = salarioHora*horaTrabalhada; //Calculo para saber o total no mês
		float total2 = total1 ; //Salario Bruto para realizar desconto dos impostos
		float total3 = total1 ;
		float total4 = total1;
		
		
		System.out.println("Seu salario total referido no mês equivale á " + total1 + " reais");
		
		System.out.println("São descontados:");
		
		float impostoRenda = 0.11f; //Variavel de 11% de desconto do IRF
		total1 = ((total1 * impostoRenda)/100)*100;
		System.out.printf(" ***** Imposto de Renda (R$) %.2f%n " , total1);
		
		float inss = 0.8f; //Variavel de 8% de desconto do INSS
		total2 = (total2 * inss)/100;
		System.out.printf("***** INSS (R$) %.2f%n" , total2);
		
		float sindicato = 0.5f; //Variavel de 5% de desconto do Sindicato
		total3 = (total3 * sindicato)/100;
		System.out.printf(" ***** Sindicato (R$) %.2f%n" , total3);
		
		float salarioLiquido; 
		salarioLiquido = ( total4 - total2 - total3); //Salario Liquido Descontando os Impostos
		System.out.printf(" ***** Salario Liquido %.2f%n", salarioLiquido);
		
		

	}

}
