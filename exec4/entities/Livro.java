package exec4.entities;

public class Livro {
	
	private int id;
	private String nome = new String();
	private Autor autor;
    private String generoLiterario = new String(); 
    private Integer valor;
    
    public Livro() {;
	}
    
    public Livro(String nome, Autor autor) {
		this.nome = nome;
		this.autor = autor;

	}
    
    public Livro(String nome, String generoLiterario, Integer valor) {
		this.nome = nome;
		this.generoLiterario = generoLiterario;
		this.valor = valor;
	}
    
    public Livro(String nome,Integer valor) {
		this.nome = nome;
		this.valor = valor;
	}
    
    
    public Livro(String nome, Autor autor, String generoLiterario, Integer valor) {
		this.nome = nome;
		this.autor = autor;
		this.generoLiterario = generoLiterario;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getGeneroLiterario() {
		return generoLiterario;
	}

	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}
    
    
}
