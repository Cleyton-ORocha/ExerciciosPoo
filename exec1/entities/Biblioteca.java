package exec1.entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	protected List<Livro> livrosDisponiveis = new ArrayList<>();
	protected List<Pessoa> pessoasAutorizadas = new ArrayList<>();
	protected List<Livro> livrosIndisponiveis = new ArrayList<>();
	protected List<Pessoa> pessoasNaoAutorizadas = new ArrayList<>();
	

	public Biblioteca(List<Livro> livrosDisponiveis, List<Pessoa> pessoasAutorizadas) {
		this.livrosDisponiveis = livrosDisponiveis;
		this.pessoasAutorizadas = pessoasAutorizadas;
	}

	
	
	public List<Livro> getlivrosDisponiveis() {
		return livrosDisponiveis;
	}
	
	public List<Pessoa> getPessoasAutorizadas() {
		return pessoasAutorizadas;
	}
	
	public void addlivrosDisponiveis(Livro livro) {
		this.livrosDisponiveis.add(livro);
	}
	
	public void addPessoa(Pessoa pessoa) {
		this.pessoasAutorizadas.add(pessoa);
	}
	
	public void removelivrosDisponiveis(int id) {
		livrosDisponiveis.remove(id++);	
	}
	
	public void removePessoa(int id) {
		pessoasAutorizadas.remove(id++);	
	}

	
	public void adicioEmbibliotecaPessoas(Pessoa pessoa) {
		
		if(pessoa.getEmprestado() == false) {
			this.pessoasAutorizadas.add(pessoa);
		}else {
			this.pessoasNaoAutorizadas.add(pessoa);
		}
	}
	
	
	public void emprestarLivro(int idPessoa, String nomeLivro) {
		
		for(Pessoa pessoa : pessoasAutorizadas) {
			
			if(pessoa.getID() == idPessoa) {
				pessoa.setEmprestado(false);
				pessoasAutorizadas.remove(pessoa);
				pessoasNaoAutorizadas.add(pessoa);
				pessoa.adicionaEmprestimoQtd();
			}else {System.out.println("Pessoa não cadastrada");}
			
			for(Livro livro : livrosDisponiveis) {
				
				if(livro.getTitulo() == nomeLivro) {
					livro.setEmprestado(false);
					livrosDisponiveis.remove(livro);
					livrosIndisponiveis.add(livro);
				}else {System.out.println("Livro não cadastrado");}
			}	
		}
	}
	
	public void devolverLivro(int idPessoa, String nomeLivro) {
		for(Pessoa pessoa : pessoasNaoAutorizadas) {
			
			if(pessoa.getID() == idPessoa) {
				pessoa.setEmprestado(true);
				pessoasNaoAutorizadas.remove(pessoa);
				pessoasAutorizadas.add(pessoa);
			}else {System.out.println("Pessoa não cadastrada ou não pegou livro");}
		
			for(Livro livro : livrosIndisponiveis) {
				
				if(livro.getTitulo() == nomeLivro) {
					livro.setEmprestado(true);
					livrosIndisponiveis.remove(livro);
					livrosDisponiveis.add(livro);
				}else {System.out.println("Livro não cadastrado ou já está disponivel para emprestimo");}
			}	
		}
	}


	public void pesquisaLivro(String chave) {
		
		System.out.println("Pesquise por nome, Autor ou ISBN do livro");
		
		for (Livro livro : livrosDisponiveis) {
			
			if (livro.getTitulo() == chave || livro.getAutor() == chave || livro.getISBN() == chave) {
				System.out.println(livro.toString());
				}
			else {System.out.println("Pesquisa falha");}
			
		}
	 }
	
	
	public void emprestimoQtd(Pessoa pessoa) {
		pessoa.getEmprestimoQtd();
	}
	
	  
}
