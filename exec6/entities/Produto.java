package exec6.entities;

public class Produto {
	private int idproduto;
	private String nome;
	private String categoria;
	private Double valor;
	private String descricao;
	private Integer quantidade;
	
	
	public Produto(int idproduto, String nome, Double valor, String descricao) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	
	public Produto(int idproduto, String nome, Double valor, String descricao, Integer quantidade) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	public Produto(int idproduto, String nome, String categoria, Double valor, Integer quantidade) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Produto(int idproduto, String nome, String categoria, Double valor, String descricao, Integer quantidade) {
		this.idproduto = idproduto;
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
