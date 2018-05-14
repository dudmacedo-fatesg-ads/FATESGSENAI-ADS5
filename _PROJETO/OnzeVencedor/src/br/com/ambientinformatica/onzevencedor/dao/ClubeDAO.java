package br.com.ambientinformatica.onzevencedor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ambientinformatica.onzevencedor.entity.Clube;

@Repository("clubeDao")
public class ClubeDAO {
	@PersistenceContext
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Clube> findAll() {
		String jpql = " SELECT c from Clube c order by c.nome";
		Query query = entityManager.createQuery(jpql);
		List<Clube> clubes = (List<Clube>) query.getResultList();
		return clubes;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Clube> findByName(String nomeClube) {
		String jpql = " SELECT c from Clube c where nome like :nome order by c.nome";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nome", nomeClube + "%");
		List<Clube> clubes = (List<Clube>) query.getResultList();
		return clubes;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Clube findById(Integer idfClube) {
		String jpql = "SELECT c FROM Clube c WHERE idf_clube = :idfclube";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("idfclube", idfClube);
		Clube clube = ((List<Clube>) query.getResultList()).get(0);
		return clube;
	}

	@Transactional
	public Clube create(Clube clube) {
		entityManager.persist(clube);
		return clube;
	}

	@Transactional
	public void update(Clube clube) {
		entityManager.merge(clube);
	}

	@Transactional
	public void delete(Clube clube) {
		clube = entityManager.find(Clube.class, clube.getId());
		entityManager.remove(clube);
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
