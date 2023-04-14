package exec3.entities;

import java.util.ArrayList;
import java.util.List;

public class Jaula {
	
	private Integer numero;
	private Integer capacidade;
	protected List<Animal> animais = new ArrayList<>();
	
	
	public Jaula(Integer numero, Integer capacidade) {
		this.numero = numero;
		this.capacidade = capacidade;
		
	}

	public void adicionarAnimal(Animal animal) {
		for(int i = 1; i <= capacidade; i++) {
			this.animais.add(animal);
		}
	}
	
	public void removerAnimal(Animal animal) {
		for(int i = 1; i <= capacidade; i++) {
			this.animais.remove(animal);
		}
	}
	
	public void listarAnimais() {
		
		System.out.println("Lista de animais: ");
		
		for(Animal i : animais) {
			System.out.println(i.getNome() + " : " + i.getEspecie());
		}
	}
	
	public Double calcularIdadeMedia() {
		Double listaMedia = 0.0;
		for(Animal i : animais) {
			listaMedia += i.getIdade();
		}
		return listaMedia / animais.size();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public List<Animal> getAnimais() {
		return animais;
	}
	
	
}
