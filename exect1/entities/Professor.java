package exect1.entities;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor(int iD, String nome, String disciplina) {
		super(iD, nome);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
