package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

public class Exe02NomeDeUsuarioDiferenteDaSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int cont = 1;
		
		boolean infoValidas = false;
		String senha, nome;
		
		do {
			System.out.println("Digite seu nome de usuario: ");
		
		nome = scan.nextLine();
		System.out.println("Digite sua senha: ");
		senha = scan.nextLine();
									
		if (nome.equalsIgnoreCase(senha)) {
			//infoValidas = false;
		}else {
			infoValidas = true;
			System.out.println("Senha e Usuarios Válidos");
		}		
							 
		}while (!infoValidas);
			 
		
	}
	

}
