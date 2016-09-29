package br.com.colecionismo.dao;

import br.com.colecionismo.modelo.Item;

public interface ItemService {
	
	public void salvar(Item item);
	public void alterar(Item item);
	public void excluir(Item item);

}
