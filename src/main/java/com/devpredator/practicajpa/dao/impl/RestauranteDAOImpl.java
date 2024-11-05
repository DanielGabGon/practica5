/**
 * 
 */
package com.devpredator.practicajpa.dao.impl;

import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.entity.Restaurante;

/**
 * @author 4PF28LA_2004
 *
 */
public class RestauranteDAOImpl implements RestauranteDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");

	@Override
	public void guardar(Restaurante restaurante) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(restaurante);
			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
		} finally {
			entityManager.close();
		}

	}

	@Override
	public void actualizar(Restaurante restaurante) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.merge(restaurante);
			entityTransaction.commit();
		} catch (Exception e) {
             if(entityTransaction!=null) {
            	 entityTransaction.rollback();
             }
		}finally {
			entityManager.close();
		}

	}

	@Override
	public void eliminar(Long id) {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        Restaurante restaurante= entityManager.find(Restaurante.class, id);
        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
		try {
			entityManager.remove(restaurante);
			entityTransaction.commit();
		} catch (Exception e) {
			if(entityTransaction!=null) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
		}

	}

	@Override
	public List<Restaurante> consultar() {
		EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
         TypedQuery<Restaurante> queryConsultaQuery=null;
         try {
        	 
        	 queryConsultaQuery=(TypedQuery<Restaurante>) entityManager.createQuery("FROM Restaurante");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return queryConsultaQuery.getResultList();

	}

}
