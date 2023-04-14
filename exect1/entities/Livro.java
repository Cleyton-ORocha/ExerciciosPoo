package exect1.entities;

public class Livro {
	
	private String titulo;
	private String autor;
	private String ISBN;
	private String dataPublicacao;
	private Boolean emprestado = false;
	
	
	public Livro(String titulo, String autor, String ISBN, String dataPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.dataPublicacao = dataPublicacao;
	}
	
	
	public Livro(String titulo, String autor, String ISBN, String dataPublicacao, Boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.dataPublicacao = dataPublicacao;
		this.emprestado = emprestado;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(Boolean emprestado) {
		this.emprestado = emprestado;
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", dataPublicacao=" + dataPublicacao
				+ ", emprestado=" + emprestado + "]";
	} 
	
	

	

}
