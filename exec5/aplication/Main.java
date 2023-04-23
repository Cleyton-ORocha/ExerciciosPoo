package exec5.aplication;

import exec5.DAO.ContatoDAO;
import exec5.entities.Contato;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato(1 ,"Niga", 1, "9179885494");
		
		
//		try {
//			ContatoDAO.save(contato);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		for(Contato contato : ContatoDAO.listaContato()) {
//			System.out.println(contato.getId());
//			System.out.println(contato.getNome());
//			System.out.println(contato.getIdade());
//			System.out.println(contato.getContato());
//		}

//		try {
//			ContatoDAO.atualiza(contato);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			ContatoDAO.deletar(contato);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
