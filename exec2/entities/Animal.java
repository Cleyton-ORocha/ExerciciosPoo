package exec2.entities;

import exec2.interfaces.Comportamento;

public abstract class Animal implements Comportamento{
	
	//1
	protected String nome;
	protected Integer idade;
	
	
	//2
	public Animal(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//3
	public void emitirSom() {System.out.printf("O som do %s é 'null' \n", this.nome);}
	public void mover(){System.out.printf("O %s está se movendo! \n", nome);}
	public void exibirDados() {
		System.out.println( "Animal [nome=" + nome + ", idade=" + idade + "]");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	abstract public String exibirInfo();
	
	
	

}
