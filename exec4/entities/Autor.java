package exec4.entities;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome; 
    private String nacionalidade; 
    private String dataNascimento; 
    private String biografia; 
    private List<Livro> obras = new ArrayList<>(); 
    @SuppressWarnings("unused")
	private int quantidadeObras;
    private String generoLiterario; 
    private boolean ativo;
	
  
    public Autor() {};
    
    
    
    public Autor(String nome, boolean ativo) {
		this.nome = nome;
		this.ativo = ativo;
	}
    
    public Autor(String nome, String nacionalidade, boolean ativo) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.ativo = ativo;
	}
    
    public Autor(String nome, String nacionalidade, String dataNascimento, boolean ativo) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.dataNascimento = dataNascimento;
		this.ativo = ativo;
	}
    
    public Autor(String nome, String nacionalidade, String dataNascimento, String biografia, boolean ativo) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.dataNascimento = dataNascimento;
		this.biografia = biografia;
		this.ativo = ativo;
	}
    
    public Autor(String nome, String nacionalidade, String dataNascimento, String biografia, String generoLiterario,
			boolean ativo) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.dataNascimento = dataNascimento;
		this.biografia = biografia;
		this.generoLiterario = generoLiterario;
		this.ativo = ativo;
	}

	public void adicionarLivro(Livro livro) {
    	this.obras.add(livro);
		this.quantidadeObras = obras.size();
    }
    
    public void removerLivro(Livro livro) {
    	this.obras.remove(livro);
		this.quantidadeObras = obras.size();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
    








    
}