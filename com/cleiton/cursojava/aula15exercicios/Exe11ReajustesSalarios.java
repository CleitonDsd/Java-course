package com.cleiton.cursojava.aula15exercicios;

import java.util.Scanner;

public class Exe11ReajustesSalarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scan.nextLine(); //Nome do colaborador
		
		System.out.println("Insira o seu Sálario (R$): ");
		double salario = scan.nextDouble();
		
		
		double reajuste; //salario com reajuste
		double diferenca; //Diferença do salario antigo para depois do reajuste
		
		if (salario <= 280) {
			
			System.out.println("Caro colaborador(a) " + nome + " seu salario antes do reajuste é de (R$): " + salario );
			reajuste = (1 + 0.20) * (salario );
			diferenca = (reajuste - salario);
			System.out.println("Reajuste salarial: 20%");
			System.out.println("Valor do aumento: " + diferenca);
			System.out.println("Salario pós reajuste (R$): " + reajuste);	
		}
		else if (salario >= 280 && salario <= 700) {
			
			System.out.println("Caro colaborador(a) " + nome + " seu salario antes do reajuste é de (R$): " + salario );
			reajuste = (1 + 0.15) * (salario );
			diferenca = (reajuste - salario);
			System.out.println("Reajuste salarial: 15%");
			System.out.println("Valor do aumento (R$): " + diferenca);
			System.out.println("Salario pós reajuste (R$): " + reajuste);	
		}
		else if (salario >= 700 && salario <= 1500) {
			
			System.out.println("Caro colaborador(a) " + nome + " seu salario antes do reajuste é de (R$): " + salario );
			reajuste = (1 + 0.10) * (salario );
			diferenca = (reajuste - salario);
			System.out.println("Reajuste salarial: 10%");
			System.out.println("Valor do aumento (R$): " + diferenca);
			System.out.println("Salario pós reajuste (R$): " + reajuste);	
		}
		else if (salario >= 1500) {
			
			System.out.println("Caro colaborador(a) " + nome + " seu salario antes do reajuste é de (R$): " + salario );
			reajuste = (1 + 0.05) * (salario );
			diferenca = (reajuste - salario);
			System.out.println("Reajuste salarial: 5%");
			System.out.println("Valor do aumento (R$): " + diferenca);
			System.out.println("Salario pós reajuste (R$): " + reajuste);	
			
		}
		

	}

}
