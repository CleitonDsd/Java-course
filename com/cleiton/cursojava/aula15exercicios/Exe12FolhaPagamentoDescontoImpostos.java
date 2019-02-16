package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe12FolhaPagamentoDescontoImpostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira suas horas trabalhadas: ");
		double horasTrabalhadas= scan.nextDouble();
		
		System.out.println("Insira seu salario por hora: ");
		double salarioHora = scan.nextDouble();
		 
		double salarioBruto = (horasTrabalhadas*salarioHora);
		
		double salarioLiquido;
		double fgts = 0.11;           // FGTS 11%
		double impostoRenda = 0.05;  // IR 5%
		double sindicato = 0.03;    // Sindicato 3%
		double inss = 0.10;		   // INSS
		double totalImpostos; 	  //Soma do impostos, exceto FGTS.
		
		if (salarioBruto <= 900) {
			
			impostoRenda = (1 - impostoRenda)*salarioBruto;
			impostoRenda = salarioBruto - impostoRenda;
			sindicato = (1 - sindicato) * (salarioBruto);
			sindicato = salarioBruto - sindicato;
			inss = (1 - inss) * (salarioBruto);
			inss = salarioBruto - inss;
			fgts = (((1 - fgts) * salarioBruto))/12;
			totalImpostos = (impostoRenda + inss );
			salarioLiquido = (((salarioBruto - impostoRenda)-inss));
			
			System.out.println(" Funcionário: " + nome);
			System.out.printf (" Salário Bruto(R$): %.2f%n " , salarioBruto );
			System.out.printf ("Imposto de Renda(R$): %.2f%n " , impostoRenda );
			System.out.printf ("INSS(R$): %.2f%n " , inss);
			System.out.printf ("FGTS (R$): %.2f%n " , fgts);
			System.out.printf ("Total Descontos(R$): %.2f%n " , totalImpostos);
			System.out.printf ("Salario Liquido(R$): %.2f%n " , salarioLiquido);
					
		}
		if (salarioBruto >= 900 && salarioBruto <= 1500) {
			
			impostoRenda = (1 - impostoRenda)*salarioBruto;
			impostoRenda = salarioBruto - impostoRenda;
			sindicato = (1 - sindicato) * (salarioBruto);
			sindicato = salarioBruto - sindicato;
			inss = (1 - inss) * (salarioBruto);
			inss = salarioBruto - inss;
			fgts = (((1 - fgts) * salarioBruto))/12;
			totalImpostos = (impostoRenda + inss );
			salarioLiquido = (((salarioBruto - impostoRenda)-inss));
			
			System.out.println(" Funcionário: " + nome);
			System.out.printf (" Salário Bruto(R$): %.2f%n " , salarioBruto );
			System.out.printf ("Imposto de Renda(R$): %.2f%n " , impostoRenda );
			System.out.printf ("INSS(R$): %.2f%n " , inss);
			System.out.printf ("FGTS (R$): %.2f%n " , fgts);
			System.out.printf ("Total Descontos(R$): %.2f%n " , totalImpostos);
			System.out.printf ("Salario Liquido(R$): %.2f%n " , salarioLiquido);
					
		}
		if (salarioBruto >= 1500 && salarioBruto <= 2500) {
			
			impostoRenda = (1 - impostoRenda)*salarioBruto;
			impostoRenda = salarioBruto - impostoRenda;
			sindicato = (1 - sindicato) * (salarioBruto);
			sindicato = salarioBruto - sindicato;
			inss = (1 - inss) * (salarioBruto);
			inss = salarioBruto - inss;
			fgts = (((1 - fgts) * salarioBruto))/12;
			totalImpostos = (impostoRenda + inss );
			salarioLiquido = (((salarioBruto - impostoRenda)-inss));
			
			System.out.println(" Funcionário: " + nome);
			System.out.printf (" Salário Bruto(R$): %.2f%n " , salarioBruto );
			System.out.printf ("Imposto de Renda(R$): %.2f%n " , impostoRenda );
			System.out.printf ("INSS(R$): %.2f%n " , inss);
			System.out.printf ("FGTS (R$): %.2f%n " , fgts);
			System.out.printf ("Total Descontos(R$): %.2f%n " , totalImpostos);
			System.out.printf ("Salario Liquido(R$): %.2f%n " , salarioLiquido);
					
		}
		if (salarioBruto >2500) {
			
			impostoRenda = (1 - impostoRenda)*salarioBruto;
			impostoRenda = salarioBruto - impostoRenda;
			sindicato = (1 - sindicato) * (salarioBruto);
			sindicato = salarioBruto - sindicato;
			inss = (1 - inss) * (salarioBruto);
			inss = salarioBruto - inss;
			fgts = (((1 - fgts) * salarioBruto))/12;
			totalImpostos = (impostoRenda + inss );
			salarioLiquido = (((salarioBruto - impostoRenda)-inss));
			
			System.out.println(" Funcionário: " + nome);
			System.out.printf (" Salário Bruto(R$): %.2f%n " , salarioBruto );
			System.out.printf ("Imposto de Renda(R$): %.2f%n " , impostoRenda );
			System.out.printf ("INSS(R$): %.2f%n " , inss);
			System.out.printf ("FGTS (R$): %.2f%n " , fgts);
			System.out.printf ("Total Descontos(R$): %.2f%n " , totalImpostos);
			System.out.printf ("Salario Liquido(R$): %.2f%n " , salarioLiquido);
			
		}
		

	}

}
