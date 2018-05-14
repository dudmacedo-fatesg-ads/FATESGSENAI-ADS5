package br.com.ambientinformatica.onzevencedor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ambientinformatica.onzevencedor.entity.Atleta;
import br.com.ambientinformatica.onzevencedor.entity.Clube;

@Repository("atletaDao")
public class AtletaDao {
	@PersistenceContext
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Atleta> findAll() {
		String jpql = "SELECT a FROM Atleta a ORDER BY a.nome";
		Query query = entityManager.createQuery(jpql);
		List<Atleta> atleta = (List<Atleta>) query.getResultList();
		return atleta;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Atleta> findByName(String nomeAtleta) {
		String jpql = "SELECT a FROM Atleta a WHERE nome LIKE :nome ORDER BY a.nome";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nome", nomeAtleta + "%");
		List<Atleta> atleta = (List<Atleta>) query.getResultList();
		return atleta;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Atleta> findByClube(Integer clube) {
		String jpql = "SELECT a FROM Atleta a WHERE idf_clube = :idf_clube ORDER BY a.nome";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("idf_clube", clube);
		List<Atleta> atleta = (List<Atleta>) query.getResultList();
		return atleta;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Clube findClubeById(Integer idfClube) {
		String jpql = "SELECT c FROM Clube c WHERE idf_clube = :idfclube";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("idfclube", idfClube);
		Clube clube = ((List<Clube>) query.getResultList()).get(0);
		return clube;
	}

	@Transactional
	public Atleta create(Atleta atleta) {
		entityManager.persist(atleta);
		return atleta;
	}

	@Transactional
	public void update(Atleta atleta) {
		entityManager.merge(atleta);
	}

	@Transactional
	public void delete(Atleta atleta) {
		atleta = entityManager.find(Atleta.class, atleta.getIdf());
		entityManager.remove(atleta);
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
