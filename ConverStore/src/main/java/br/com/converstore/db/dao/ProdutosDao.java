package br.com.converstore.db.dao;
// Generated 11/04/2017 17:48:49 by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.converstore.db.entity.Produtos;

/**
 * Home object for domain model class Produtos.
 * @see entity.Produtos
 * @author Hibernate Tools
 */
@Stateless
public class ProdutosDao {

	private static final Log log = LogFactory.getLog(ProdutosDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void salvar(Produtos transientInstance) {
		log.debug("Salvando Produtos");
		try {
			entityManager.persist(transientInstance);
			log.debug("Salvo!");
		} catch (RuntimeException re) {
			log.error("Falhou", re);
			throw re;
		}
	}

	public void excluir(Produtos persistentInstance) {
		log.debug("excluindo Produtos");
		try {
			entityManager.remove(persistentInstance);
			log.debug("deletado!");
		} catch (RuntimeException re) {
			log.error("falhou", re);
			throw re;
		}
	}

	public Produtos atualiza(Produtos detachedInstance) {
		log.debug("Atualizando dados");
		try {
			Produtos result = entityManager.merge(detachedInstance);
			log.debug("Atualizado!");
			return result;
		} catch (RuntimeException re) {
			log.error("A atualização falhou!", re);
			throw re;
		}
	}

	public Produtos findById(int id) {
		log.debug("getting Produtos instance with id: " + id);
		try {
			Produtos instance = entityManager.find(Produtos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
