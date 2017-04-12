package br.com.converstore.db.dao;
// Generated 11/04/2017 17:48:49 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.converstore.db.entity.Equivalencia;

/**
 * Home object for domain model class Equivalencia.
 * @see entity.Equivalencia
 * @author Hibernate Tools
 */
@Stateless
public class EquivalenciaDao {

	private static final Log log = LogFactory.getLog(EquivalenciaDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Equivalencia transientInstance) {
		log.debug("persisting Equivalencia instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Equivalencia persistentInstance) {
		log.debug("removing Equivalencia instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Equivalencia merge(Equivalencia detachedInstance) {
		log.debug("merging Equivalencia instance");
		try {
			Equivalencia result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Equivalencia findById(int id) {
		log.debug("getting Equivalencia instance with id: " + id);
		try {
			Equivalencia instance = entityManager.find(Equivalencia.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
