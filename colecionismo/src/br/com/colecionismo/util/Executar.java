package br.com.colecionismo.util;


import br.com.colecionismo.dao.ItemDao;
import br.com.colecionismo.modelo.Item;

public class Executar {
	
	public static void main(String[] args) {
		ItemDao dao = new ItemDao();
		Item item = new Item();
		item.setNome("Asterix");
		
		dao.salvar(item);
		
	}
	
	

}
