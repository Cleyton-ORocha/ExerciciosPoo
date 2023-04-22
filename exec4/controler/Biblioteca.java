//error

package exec4.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exec4.entities.*;

public class Biblioteca {


	public static void main(String[] args) {
		
		List<Livro> livrosBiblioteca = new ArrayList<>();
		List<Autor> autoresBiblioteca = new ArrayList<>();
		List<Usuario> usuariosBiblioteca = new ArrayList<>();
		List<Livro> livrosEmprestadosBiblioteca = new ArrayList<>();
		
		System.out.println("Sistema de Biblioteca");
		Scanner scaner = new Scanner(System.in);
	
		while(true) {
			
			System.out.println("Digite uma opção:\n" 
			+ "1 - Cadastrar Livro\n"
			+ "2 - Cadastrar Autor\n"
			+ "3 - Pesquisar\n"
			+ "4 - Listar livros\n"
			+ "5 - Redalizar empréstimo/ devolução\n");
			
			int opcao = scaner.nextInt();
				
			if(opcao == 1) {
				
				
				System.out.println("Digite o nome do livro");
				String nomeLivro = scaner.nextLine();
				scaner.nextLine();
				
				// Verifica se o nome do autor está no banco
				System.out.println("Digite o nome do autor");
				String autorNome = scaner.nextLine();
				
				Autor autor = null;
				for(Autor i : autoresBiblioteca) {
					if(i.getNome() == autorNome) {
						autor = i;
					}
				}
				
				System.out.println("Digite o gênero literário do livro");
				String generoLiterario = scaner.nextLine();
				
				
				System.out.println("Digite o valor do livro");
				Integer valor = scaner.nextInt();
				
				
				
				livrosBiblioteca.add(new Livro( nomeLivro, autor, generoLiterario, valor));
		
			}
			
			
			
			else if(opcao == 2) {
				
				System.out.println("Digite o nome do autor");
				String nomeAutor = scaner.nextLine();
				scaner.nextLine();
				
				System.out.println("Digite a nacionalidade do autor");
				String nacionalidade = scaner.nextLine();
				scaner.nextLine();					
				
				System.out.println("Digite sua data de nascimento");
				String dataNascimento = scaner.nextLine();
				scaner.nextLine();
				
				System.out.println("Digite sua biografia");
				String biografia = scaner.nextLine();
				scaner.nextLine();
				
				System.out.println("Digite seu gênero literário");
				String generoLiterario = scaner.nextLine();
				scaner.nextLine();
				
				System.out.println("O autor ainda está ativo? ");
				Boolean ativo = scaner.nextBoolean();
				
				autoresBiblioteca.add(new Autor(nomeAutor, 
						nacionalidade, 
						dataNascimento, 
						biografia, 
						generoLiterario, 
						ativo));
				
			}
			
			
			
			else if(opcao == 3) {
				
				System.out.println("Digite uma opção:\n" 
				+ "1 - Buscar Livro\n"
				+ "2 - Buscar Autor\n"
				+ "3 - Buscar Usuário Cadastrado\n");
				
				int escolha = scaner.nextInt();
				
				if(escolha == 1) {
					
					System.out.println("Digite o ID do livro");
					int idLivro = scaner.nextInt();
					
					for(Livro i : livrosBiblioteca) {
						if(idLivro == i.getId()) {
							System.out.println(i);
						}
					}
				}
				
				if(escolha == 2) {
					
					System.out.println("Digite o nome do autor");
					String autor = scaner.next();
					
					for(Autor i : autoresBiblioteca) {
						if(autor == i.getNome()) {
							System.out.println(i);
						}
					}
				}
				
				if(escolha == 3) {
					
					System.out.println("Digite o nome do usuário");
					String usuario = scaner.next();
					
					for(Usuario i : usuariosBiblioteca) {
						if(usuario == i.getNome()) {
							System.out.println(i);
						}
					}
				}
			}
			
			else if(opcao == 4) {
				
				for(Livro livro : livrosBiblioteca) {
					livro.toString();
				}
				
			}

			else if(opcao == 5) {
				
				Livro livro = null;

				System.out.println("Qual o ID do livro que ira imprestar?");
				int livroID = scaner.nextInt();
				
				for(Livro i : livrosBiblioteca) {
					if(livroID == i.getId()) {
						livrosEmprestadosBiblioteca.add(i);
						livro = i;
					}
				}
				
				System.out.println("Qual o ID da pessoa quem vai emprestar o livro?");
				int pessoaID = scaner.nextInt();
				
				for(Usuario i : usuariosBiblioteca) {
					if(pessoaID == i.getId()) {
						i.adicionarLivro(livro);
					}
				}
				
			}
			
			else if(opcao == 6) {
				System.out.println("fechou");
				scaner.close();
				break;
			}
			
		}
	}
}
