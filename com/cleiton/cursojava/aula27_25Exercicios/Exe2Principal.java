package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe2Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exe2ContaCorrente conta = new Exe2ContaCorrente();

		Scanner scan = new Scanner(System.in);
		double operacao;
		
		conta.pegarDados();
		
		System.out.println("Qual operação deseja fazer? " + "\n1 - Sacar " + "\n2 - Depositar "
				+ "\n3 - Consultar Saldo " + "\n4 - Verificar Cheque");
		operacao = scan.nextInt();

		if (operacao == 1) {
			conta.sacar(0);
			
		} else if (operacao == 2) {
			conta.depositar(0);
			
		} else if (operacao == 3) {
			conta.consultarSaldo(0);
			
		} else if (operacao == 4) {
			conta.consultarSaldo(0);
			
		} else {
			System.out.println("Operação Inválida");
		}	

	}

}
