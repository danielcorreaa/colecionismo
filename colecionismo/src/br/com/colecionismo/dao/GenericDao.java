package br.com.colecionismo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.colecionismo.util.JpaUtil;

public abstract class GenericDao<T> {

	private EntityManager entityManager;
	private EntityTransaction transation;

	public GenericDao() {
		entityManager = JpaUtil.getEntityManager();
		transation = entityManager.getTransaction();
	}

	public void salvar(T obj) {
		transation.begin();
		entityManager.persist(obj);
		transation.commit();
	}
	
	public void alterar(T obj){
		
	}
	public void excluir(T obj){
		
	}

}
