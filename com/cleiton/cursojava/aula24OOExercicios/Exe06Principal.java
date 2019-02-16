package com.cleiton.cursojava.aula24OOExercicios;

public class Exe06Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exe06ContatoCelular contato1 = new Exe06ContatoCelular();
		
		contato1.nome = "Maria";
		contato1.email = "maria@gmail.com";
		contato1.endereco = "Rua da Paz, 780 - SP";
	
		contato1.telefones = new String [5];
		contato1.telefones [0] ="(XX) 9 9999-9999";
		contato1.telefones [1] ="(XX) 9 8888-8888";	
		
		System.out.println("Nome: " + contato1.nome);
	}

}
