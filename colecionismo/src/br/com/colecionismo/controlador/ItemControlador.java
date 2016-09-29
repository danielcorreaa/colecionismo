package br.com.colecionismo.controlador;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.colecionismo.dao.ItemService;
import br.com.colecionismo.modelo.Item;

@Named("itemControlador")
@RequestScoped
public class ItemControlador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private Item item;
	@Inject
	private ItemService dao;

	public void salvar(AjaxBehaviorEvent event) {
		dao.salvar(item);		
	}
	
	public ItemControlador() {
		
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ItemService getDao() {
		return dao;
	}

	public void setDao(ItemService dao) {
		this.dao = dao;
	}

}
