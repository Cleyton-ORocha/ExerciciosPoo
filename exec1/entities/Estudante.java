package exec1.entities;

public class Estudante extends Pessoa {
	
	private String matricula;

	public Estudante(int iD, String nome, String matricula) {
		super(iD, nome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
}
