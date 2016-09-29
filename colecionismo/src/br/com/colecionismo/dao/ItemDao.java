package br.com.colecionismo.dao;

import javax.inject.Named;

import br.com.colecionismo.modelo.Item;
@Named
public class ItemDao extends GenericDao<Item> implements ItemService {

}
