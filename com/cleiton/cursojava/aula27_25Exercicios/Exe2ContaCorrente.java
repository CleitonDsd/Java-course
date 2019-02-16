package com.cleiton.cursojava.aula27_25Exercicios;

import java.util.Scanner;

public class Exe2ContaCorrente {

	Scanner scan = new Scanner(System.in);
	int numeroConta;
	double saldo, limite;
	String especial;

	void pegarDados() {

		System.out.println("Digite o número da conta: ");
		numeroConta = scan.nextInt();

		System.out.println("Insira o  Saldo da conta: ");
		saldo = scan.nextDouble();

		System.out.println("Digite o limite da conta: ");
		limite = scan.nextDouble();

		System.out.println("Credito especial: ");
		especial = scan.nextLine();
		if (especial != "sim" || especial != "não") {
			System.out.println("Dado inválido, digite:");
			System.out.println("Credito especial: ");
			especial = scan.nextLine();
		}

	}

	void sacar(double saque) {

		System.out.print("SAQUES" + "\nN° conta: " + numeroConta);

		System.out.print("Saldo disponível (R$): " + saldo);
		System.out.println("Valor do saque (R$): ");
		saque = scan.nextDouble();

		if (saque > saldo || saque < 0) {
			System.out.println("Operação Inválida, saldo indisponível");
		} else {
			saldo -= saque;

			System.out.println("Saldo Atual (R$):" + saldo);
		}

	}

	void depositar(double deposito) {

		System.out.println("DEPÓSITO " + "\nN° conta: " + numeroConta);

		System.out.print("Saldo atual (R$): " + saldo);
		System.out.println("Valor do saque (R$): ");
		deposito = scan.nextDouble();

		if (deposito == 0 || deposito < 0) {
			System.out.println("Operação Inválida, depósito igual á 0");
		} else {

			saldo += deposito;

			System.out.println("Saldo Atual (R$): " + saldo);

		}

	}

	void consultarSaldo(double verSaldo) {
		
		System.out.println("Consulta de Saldo (R$): ");
		System.out.println("Saldo atual (R$): " + saldo);

	}

	void verificarCheque(String verCheque) {
		
		System.out.println("Cheque Especial: " + especial);

	}
}
