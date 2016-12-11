package main;

import java.util.ArrayList;

import dao.ContatoDao;
import entity.Contato;
import entity.Telefone;

public class TestePersistencia {

	public static void main(String[] args) {
		ContatoDao contatoDao = new ContatoDao();
		
		Telefone tel = new Telefone("32", "98888-0000", "C");
		ArrayList<Telefone> telefones = new ArrayList<>();
		telefones.add(tel);
		
		Contato contato = new Contato("Fulano", 20, telefones);
		contatoDao.salvar(contato);

	}

}
