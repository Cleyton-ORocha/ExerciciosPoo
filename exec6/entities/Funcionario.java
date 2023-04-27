package exec6.entities;

public class Funcionario {
	
	private int id;
	private String nome;
	private String CPF;
	private char sexo;
	private String departamento;
	
	public Funcionario(int id, String nome, String CPF, String departamento) {
		this.id = id;
		this.nome = nome;
		this.CPF = CPF;
		this.departamento = departamento;
	}
	
	public Funcionario(int id, String nome, String CPF, char sexo, String departamento) {
		this.id = id;
		this.nome = nome;
		this.CPF = CPF;
		this.sexo = sexo;
		this.departamento = departamento;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
