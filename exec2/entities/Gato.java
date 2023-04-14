package exec2.entities;

public class Gato extends Animal {

	public Gato(String nome, Integer idade) {
		super(nome, idade);

	}
	
	@Override
	public void exibirDados() {
		System.out.println( "Gato [nome=" + nome + ", idade=" + idade + "]");
	}
	
	//5
	@Override
	public void emitirSom() {
		System.out.printf("O som do %s é 'Miauuu' \n", this.nome);
		}
	
	
	//6
	
	@Override
	public void som() {
		this.emitirSom();
	}
	
	
	@Override
	public void movimento() {
		this.mover();
	}
	
	
	@Override
	public String exibirInfo() {
		return "O nome do animal é " 
				+ this.nome 
				+ " e sua idade é "
				+ this.idade
				+ "\n";
		
	}
}
