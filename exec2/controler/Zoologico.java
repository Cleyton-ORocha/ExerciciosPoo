package exec2.controler;

import exec2.entities.*;

public class Zoologico {
	
	//7
	public static void main(String[] args) {
		
		Animal gato = new Gato(null, 13);
		Animal cachorro = new Cachorro(null, 21);
		
		gato.setNome("Roberto");
		cachorro.setNome("Josevaldo");
		
		gato.emitirSom();
		cachorro.emitirSom();
		gato.mover();
		cachorro.mover();
		
		gato.exibirDados();
		cachorro.exibirDados();
		
		//3-5
		gato.som();
		gato.mover();
		
		cachorro.som();
		cachorro.mover();
	}

}
