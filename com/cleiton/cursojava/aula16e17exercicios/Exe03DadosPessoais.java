package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Exe03DadosPessoais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		String nome; //Tem que ser maior que tr�s Caracteres; 
		short idade = 0; // entre 0 e 150;
		float salario = 0; //Maior que zero;
		char estadoCivil, sexo;
		
		
		
		
		
		
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		
		if (nome.length() <3) {
			System.out.println("Nome Inv�lido");
			nome = scan.nextLine();			
		}
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextShort();
		
		if (idade > 150) {
			System.out.println("Idade inv�lida;");
		}
		
		System.out.println("Insira seu sal�rio: ");
		salario = scan.nextFloat();
		
		if (salario <=0) {
			System.out.println("Sal�rio Inv�lido");
			salario = scan.nextFloat();
		}
		
		System.out.println("Insira seu sexo (masculino (m), feminino (f): ");
		sexo = scan.next().charAt(0);
		switch (sexo) {		
			case 'f' : System.out.println("Feminino"); break;
			case 'm' : System.out.println("Masculino"); break;		
			default : System.out.println("Caracter Inv�lido, digite novamente: ");
			sexo = scan.next().charAt(0); 
		}
		
		
		System.out.println("Digite seu estado civil (solteiro(s), casado (c), vi�vo (v), divorciado(d)): ");
		estadoCivil = scan.next().charAt(0);
		
		switch (estadoCivil) {		
			case 's' : System.out.println(" Solteiro(a)"); break;
			case 'c' : System.out.println(" Casado(a)"); break;
			case 'v' : System.out.println(" Vi�vo(a)"); break;
			case 'd' : System.out.println(" Divorciado(a)"); break;
			default : System.out.println("Caracter Inv�lido, digite novamente: ");
			estadoCivil = scan.next().charAt(0);			
		}
		System.out.println("");
		System.out.println( " Nome: " + nome + "\n Idade: " + idade + "\n Sal�rio: "
				+ salario + "\n Sexo: " + sexo + "\n Estado Civ�l: " + estadoCivil );
				
	}
}
