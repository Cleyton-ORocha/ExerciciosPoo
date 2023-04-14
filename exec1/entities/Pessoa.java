package exec1.entities;

public class Pessoa {
	private int ID; 
	private String nome;
	private Livro livro;
	private Boolean emprestado = false;
	private int emprestimoQtd = 0;
	
	
	public Pessoa(int iD, String nome) {
		ID = iD;
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(Boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public int getEmprestimoQtd() {
		return emprestimoQtd;
	}

	public void adicionaEmprestimoQtd() {
		this.emprestimoQtd++;
	}
	
	
	
	

}
