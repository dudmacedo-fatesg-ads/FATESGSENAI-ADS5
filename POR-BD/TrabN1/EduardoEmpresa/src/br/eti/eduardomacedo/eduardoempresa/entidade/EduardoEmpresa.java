package br.eti.eduardomacedo.eduardoempresa.entidade;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="eduardoempresa")
public class EduardoEmpresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eduardocodigo;
	
	@Column
	private String eduardodescricao;
	
	@OneToMany(mappedBy = "eduardoempresa")
	private List<EduardoPessoa> eduardofuncionarios;

	public int getEduardocodigo() {
		return eduardocodigo;
	}

	public void setEduardocodigo(int eduardocodigo) {
		this.eduardocodigo = eduardocodigo;
	}

	public String getEduardodescricao() {
		return eduardodescricao;
	}

	public void setEduardodescricao(String eduardodescricao) {
		this.eduardodescricao = eduardodescricao;
	}

	public List<EduardoPessoa> getEduardofuncionarios() {
		return eduardofuncionarios;
	}

	public void setEduardofuncionarios(List<EduardoPessoa> eduardofuncionarios) {
		this.eduardofuncionarios = eduardofuncionarios;
	}
	
	
}
