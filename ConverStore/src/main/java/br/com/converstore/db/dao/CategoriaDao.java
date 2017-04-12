package br.com.converstore.db.dao;
// Generated 11/04/2017 17:48:49 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.converstore.db.entity.Categoria;

/**
 * Home object for domain model class Categoria.
 * @see entity.Categoria
 * @author Hibernate Tools
 */
@Stateless
public class CategoriaDao {

	private static final Log log = LogFactory.getLog(CategoriaDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Categoria transientInstance) {
		log.debug("persisting Categoria instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Categoria persistentInstance) {
		log.debug("removing Categoria instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Categoria merge(Categoria detachedInstance) {
		log.debug("merging Categoria instance");
		try {
			Categoria result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categoria findById(int id) {
		log.debug("getting Categoria instance with id: " + id);
		try {
			Categoria instance = entityManager.find(Categoria.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
