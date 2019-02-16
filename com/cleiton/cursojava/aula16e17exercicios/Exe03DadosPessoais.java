package com.cleiton.cursojava.aula16e17exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Exe03DadosPessoais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		String nome; //Tem que ser maior que três Caracteres; 
		short idade = 0; // entre 0 e 150;
		float salario = 0; //Maior que zero;
		char estadoCivil, sexo;
		
		
		
		
		
		
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		
		if (nome.length() <3) {
			System.out.println("Nome Inválido");
			nome = scan.nextLine();			
		}
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextShort();
		
		if (idade > 150) {
			System.out.println("Idade inválida;");
		}
		
		System.out.println("Insira seu salário: ");
		salario = scan.nextFloat();
		
		if (salario <=0) {
			System.out.println("Salário Inválido");
			salario = scan.nextFloat();
		}
		
		System.out.println("Insira seu sexo (masculino (m), feminino (f): ");
		sexo = scan.next().charAt(0);
		switch (sexo) {		
			case 'f' : System.out.println("Feminino"); break;
			case 'm' : System.out.println("Masculino"); break;		
			default : System.out.println("Caracter Inválido, digite novamente: ");
			sexo = scan.next().charAt(0); 
		}
		
		
		System.out.println("Digite seu estado civil (solteiro(s), casado (c), viúvo (v), divorciado(d)): ");
		estadoCivil = scan.next().charAt(0);
		
		switch (estadoCivil) {		
			case 's' : System.out.println(" Solteiro(a)"); break;
			case 'c' : System.out.println(" Casado(a)"); break;
			case 'v' : System.out.println(" Viúvo(a)"); break;
			case 'd' : System.out.println(" Divorciado(a)"); break;
			default : System.out.println("Caracter Inválido, digite novamente: ");
			estadoCivil = scan.next().charAt(0);			
		}
		System.out.println("");
		System.out.println( " Nome: " + nome + "\n Idade: " + idade + "\n Salário: "
				+ salario + "\n Sexo: " + sexo + "\n Estado Civíl: " + estadoCivil );
				
	}
}
