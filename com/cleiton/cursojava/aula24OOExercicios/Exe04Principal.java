package com.cleiton.cursojava.aula24OOExercicios;

import java.sql.Date;

public class Exe04Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		Exe04LivroDeBiblioteca livro = new Exe04LivroDeBiblioteca();
		
		livro.nome = "Conceitos de Java 20";
		livro.autor = "Cleiton";
		livro.editora = "Novatec";
		livro.isbn = "112321QAE#334S";
		livro.publicacao = "06/08/2030";	
		livro.preco = 149;
		livro.cliente = "Jose";
		livro.alugado = true;
		 
		
		livro.dataAluguel = new Date(20181116);
		livro.devolucao = new Date(20181216);
		livro.recolhido = false; // Ainda não foi entregue;
		
	}

}
