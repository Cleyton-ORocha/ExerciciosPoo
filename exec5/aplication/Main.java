package exec5.aplication;

import exec5.DAO.ContatoDAO;
import exec5.entities.Contato;

public class Main {

	public static void main(String[] args) {
		Contato contato = new Contato("Helen", 21, "3199885495");
		
		try {
			ContatoDAO.save(contato);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
