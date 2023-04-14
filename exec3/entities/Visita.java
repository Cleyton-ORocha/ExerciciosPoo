package exec3.entities;

import java.util.ArrayList;
import java.util.List;

public class Visita {
	
	private String data;
	private List<Animal> listaAnimal = new ArrayList<>();
	
	public Visita(String data) {
		this.data = data;
	}
	
	public void adicionarAnimal(Animal animal) {
		listaAnimal.add(animal);
	}
	
	public void listarAnimais() {
		for(Animal i : listaAnimal) {
			System.out.println(i.getNome() + " : " + i.getEspecie());
		}
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Animal> getListaAnimal() {
		return listaAnimal;
	}
	
	
	

}
