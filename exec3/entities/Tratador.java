package exec3.entities;

import java.util.ArrayList;
import java.util.List;

public class Tratador {

	private String nome;
	private String especialidade;
	private List<Animal> listaAnimal = new ArrayList<>();
	
	public Tratador(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void adicionarAnimal(Animal animal) {
		listaAnimal.add(animal);
	}
	
	public void removerAnimal(Animal animal) {
		listaAnimal.remove(animal);
	}
	
	public void listarAnimais() {
		for(Animal i : listaAnimal) {
			System.out.println(i.getNome() + " : " + i.getEspecie());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public List<Animal> getListaAnimal() {
		return listaAnimal;
	}
	
	
	
	
	
}
