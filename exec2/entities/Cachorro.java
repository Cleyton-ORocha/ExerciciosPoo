package exec2.entities;

public class Cachorro extends Animal {
	
	
	
	public Cachorro(String nome, Integer idade) {
		super(nome, idade);

	}
	
	public void exibirDados() {
		System.out.println( "Cachorro [nome=" + nome + ", idade=" + idade + "]");
	}
	@Override
	public void emitirSom() {
		System.out.printf("O som do %s é 'AuAu' \n", this.nome);
		}
	
	
	@Override
	public void som() {
		emitirSom();
	}
	
	
	@Override
	public void movimento() {
		mover();
	}
	
	
	@Override
	public String exibirInfo() {
		return "O nome do animal é " 
				+ this.nome 
				+ " e sua idade é "
				+ this.idade;
	}
	
	
	
	
}
