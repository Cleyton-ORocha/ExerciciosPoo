package exec4.entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private int id;
	private String nome = new String();
	private String telefone = new String();
	private List<Livro> listaLivros = new ArrayList<>();
	
	public Usuario(int id, String nome, String telefone, List<Livro> listaLivros) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.listaLivros = listaLivros;
	}
	
    public void adicionarLivro(Livro livro) {
    	this.listaLivros.add(livro);
    }
    
    public void removerLivro(Livro livro) {
    	this.listaLivros.remove(livro);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	
	

}
