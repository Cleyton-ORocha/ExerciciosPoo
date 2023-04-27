package exec6.entities;

public class Cliente {
	
	private int id;
	private String nome;
	private String CPF;
	private char sexo;
	
	public Cliente(int id, String nome, String CPF) {
		this.id = id;
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public Cliente(int id, String nome, String CPF, char sexo) {
		this.id = id;
		this.nome = nome;
		this.CPF = CPF;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
