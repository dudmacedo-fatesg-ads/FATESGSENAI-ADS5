package br.com.ambientinformatica.onzevencedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ambientinformatica.onzevencedor.dao.AtletaDao;
import br.com.ambientinformatica.onzevencedor.entity.Atleta;
import br.com.ambientinformatica.onzevencedor.entity.Clube;

@Service("atletaService")
public class AtletaService {
	@Autowired
	private AtletaDao dao;
	
	public List<Atleta> getAllAtletas(){
		return dao.findAll();
	}
	
	public List<Atleta> getAtletasByName(String nomeAtleta){
		return dao.findByName(nomeAtleta);
	}
	
	public List<Atleta> getAtletasByClube(Integer clube){
		return dao.findByClube(clube);
	}
	
	public Clube getClubeById(Integer idfClube) {
		return dao.findClubeById(idfClube);
	}
	
	public Atleta createAtleta(Atleta atleta) {
		return dao.create(atleta);
	}
	
	public void updateAtleta(Atleta atleta) {
		dao.update(atleta);
	}
	
	public void deleteAtleta(Atleta atleta) {
		dao.delete(atleta);
	}
	
	public void setDao(AtletaDao dao) {
		this.dao = dao;
	}
}
