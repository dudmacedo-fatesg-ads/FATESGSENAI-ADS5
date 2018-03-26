package br.eti.eduardomacedo.eduardoempresa.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "eduardopessoa")
public class EduardoPessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eduardomatricula;

	@Column
	private String eduardonome;

	@Temporal(TemporalType.DATE)
	private Date eduardodatanascimento;

	@Temporal(TemporalType.DATE)
	private Date eduardodataadmissao;
	
	@OneToMany(mappedBy = "eduardopessoa")
	private List<EduardoDependente> eduardodependentes;
	
	@ManyToOne
	private EduardoEmpresa eduardoempresa;

	public int getEduardomatricula() {
		return eduardomatricula;
	}

	public void setEduardomatricula(int eduardomatricula) {
		this.eduardomatricula = eduardomatricula;
	}

	public String getEduardonome() {
		return eduardonome;
	}

	public void setEduardonome(String eduardonome) {
		this.eduardonome = eduardonome;
	}

	public Date getEduardodatanascimento() {
		return eduardodatanascimento;
	}

	public void setEduardodatanascimento(Date eduardodatanascimento) {
		this.eduardodatanascimento = eduardodatanascimento;
	}

	public Date getEduardodataadmissao() {
		return eduardodataadmissao;
	}

	public void setEduardodataadmissao(Date eduardodataadmissao) {
		this.eduardodataadmissao = eduardodataadmissao;
	}

	public List<EduardoDependente> getEduardodependentes() {
		return eduardodependentes;
	}

	public void setEduardodependentes(List<EduardoDependente> eduardodependentes) {
		this.eduardodependentes = eduardodependentes;
	}

	public EduardoEmpresa getEduardoempresa() {
		return eduardoempresa;
	}

	public void setEduardoempresa(EduardoEmpresa eduardoempresa) {
		this.eduardoempresa = eduardoempresa;
	}
}
