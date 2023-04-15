package exec4.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exec4.entities.*;

public class Biblioteca {


	public static void main(String[] args) {
		
		List<Livro> livrosBiblioteca = new ArrayList<>();
		List<Autor> autoresBiblioteca = new ArrayList<>();
		
		System.out.println("Sistema de Biblioteca");
		Scanner scaner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite uma opção:" 
			+ "1 - Cadastrar Livro"
			+ "2 - Cadastrar Autor"
			+ "3 - Pesquisar"
			+ "4 - Listar livros"
			+ "5 - Realizar empréstimo/ devolução");
			
			int opcao = scaner.nextInt();
			
			try {
				
				if(opcao == 1) {
					
					
					System.out.println("Digite o nome do livro");
					String nomeLivro = scaner.next();
					
					// Verifica se o nome do autor está no banco
					System.out.println("Digite o nome do autor");
					String autorNome = scaner.next();
					Autor autor = null;
					for(Autor i : autoresBiblioteca) {
						if(i.getNome() == autorNome) {
							autor = i;
						}
					}
					
					System.out.println("Digite o nome do livro");
					String generoLiterario = scaner.next();
					
					System.out.println("Digite o nome do livro");
					Integer valor = scaner.nextInt();
					
					
					
					livrosBiblioteca.add(new Livro( nomeLivro, autor, generoLiterario, valor));
			
				}
				
				
				
				if(opcao == 2) {
					
					System.out.println("Digite o nome do autor");
					String nomeAutor = scaner.next();
					
					System.out.println("Digite a nacionalidade do autor");
					String nacionalidade = scaner.next();
					
					
					System.out.println("Digite sua data de nascimento");
					String dataNascimento = scaner.next();
					
					System.out.println("Digite sua biografia");
					String biografia = scaner.next();
					
					System.out.println("Digite seu gênero literário");
					String generoLiterario = scaner.next();
					
					System.out.println("O autor ainda está ativo? ");
					Boolean ativo = scaner.nextBoolean();
					
					autoresBiblioteca.add(new Autor(nomeAutor, 
							nacionalidade, 
							dataNascimento, 
							biografia, 
							generoLiterario, 
							ativo));
					
				}
				
				
				
				if(opcao == 3) {
					
				}
				
				if(opcao == 4) {
					
				}
	
				if(opcao == 5) {
					
				}
				
				
				
				
			}finally {scaner.close();}
		
			
			
				
		}
		
		
	}

}
