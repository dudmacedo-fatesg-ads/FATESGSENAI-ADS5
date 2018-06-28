package br.com.ambientinformatica.onzevencedor.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import br.com.ambientinformatica.onzevencedor.entity.Atleta;
import br.com.ambientinformatica.onzevencedor.entity.Clube;
import br.com.ambientinformatica.onzevencedor.entity.Posicao;
import br.com.ambientinformatica.onzevencedor.service.AtletaService;
import br.com.ambientinformatica.onzevencedor.service.ClubeService;

@ManagedBean(name = "atletaBean")
@ViewScoped
public class AtletaBean extends BaseBean {
	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{atletaService}")
	private AtletaService model;
	private Atleta atleta;
	private String nomeAtleta;
	private List<Atleta> atletas;
	private List<Posicao> posicoes;
	private boolean editMode;

	private Integer idfClube;

	public Atleta getAtleta() {
		if (atleta == null) {
			atleta = new Atleta();
		}

		return atleta;
	}

	public void salvar() {
		if (atleta.getIdf() == null || atleta.getIdf().intValue() == 0) {
			atleta.setClube(model.getClubeById(idfClube));
			atleta = model.createAtleta(atleta);
			atleta = new Atleta();
			addInfoMessage("Atleta criado com sucesso");
		} else {
			atleta.setClube(model.getClubeById(idfClube));
			model.updateAtleta(atleta);
			addInfoMessage("Atleta alterado com sucesso");
		}
	}

	public void delete() {
		model.deleteAtleta(atleta);
		if (nomeAtleta != null && !nomeAtleta.isEmpty()) {
			atletas = model.getAtletasByName(nomeAtleta);
		} else {
			atletas = model.getAllAtletas();
		}
	}

	public void create() {
		this.atleta = new Atleta();
		this.editMode = true;
	}

	public void update() {
		this.editMode = true;
	}

	public void cancel() {
		this.editMode = false;
		filtrarAtletaPorClube(null);
	}

	public void filtrarAtleta(AjaxBehaviorEvent event) {
		if (nomeAtleta != null && !nomeAtleta.isEmpty()) {
			atletas = model.getAtletasByName(nomeAtleta);
		} else {
			atletas = model.getAllAtletas();
		}
	}

	public void filtrarAtletaPorClube(AjaxBehaviorEvent event) {
		if (idfClube != null || idfClube != 0) {
			atletas = model.getAtletasByClube(idfClube);
		} else {
			atletas = model.getAllAtletas();
		}
	}

	public AtletaService getModel() {
		return model;
	}

	public void setModel(AtletaService model) {
		this.model = model;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public List<Atleta> getAtletas() {
		if (atletas == null) {
			atletas = model.getAllAtletas();
		}
		return atletas;
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	public Integer getIdfClube() {
		if (atleta != null && atleta.getClube() != null) {
			idfClube = atleta.getClube().getId();
		}
		
		return idfClube;
	}

	public void setIdfClube(Integer idfClube) {
		this.idfClube = idfClube;
	}

	public List<Posicao> getPosicoes() {
		if (posicoes == null) {
			posicoes = Arrays.asList(Posicao.values());
		}
		return posicoes;
	}
}
