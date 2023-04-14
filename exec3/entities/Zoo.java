package exec3.entities;

import java.util.ArrayList;
import java.util.List;



public class Zoo {
	
	private String nome;
	private List<Jaula> jaulas = new ArrayList<>();
	
	public Zoo(String nome) {
		this.nome = nome;
	}
	
	public void adicionarJaula(Jaula jaula) {
		jaulas.add(jaula);
	}
	
	public void removerJaula(Jaula jaula) {
		jaulas.remove(jaula);
	}
	
	public void listarJaulas() {
		for(Jaula i : jaulas) {
			System.out.println(i.getNumero() + " : " + i.getCapacidade());
		}
	}
	
	public void buscarAnimal(String nome) {
		for(Jaula i : jaulas) {
			for(Animal j : i.animais) {
				if(nome == j.getNome()) {
					i.getNumero();
				}
			}
		}
	}
	public void listarAnimaisPorEspecie(String especie) {
		for(Jaula i : jaulas) {
			for(Animal j : i.animais) {
				if(especie == j.getEspecie()) {
					System.out.println(j.getNome() + " : " + j.getEspecie());
				}
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jaula> getJaulas() {
		return jaulas;
	}
	
	
	
}
