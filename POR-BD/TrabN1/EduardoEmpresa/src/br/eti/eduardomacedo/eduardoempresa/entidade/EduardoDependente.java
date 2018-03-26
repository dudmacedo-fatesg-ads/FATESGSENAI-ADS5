package br.eti.eduardomacedo.eduardoempresa.entidade;

import javax.persistence.*;

@Entity
public class EduardoDependente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eduardocodigo;

	@Column
	private String eduardonome;

	@Column
	private String eduardoparentesco;

	@ManyToOne
	private EduardoPessoa eduardopessoa;

	public int getEduardocodigo() {
		return eduardocodigo;
	}

	public void setEduardocodigo(int eduardocodigo) {
		this.eduardocodigo = eduardocodigo;
	}

	public String getEduardonome() {
		return eduardonome;
	}

	public void setEduardonome(String eduardonome) {
		this.eduardonome = eduardonome;
	}

	public String getEduardoparentesco() {
		return eduardoparentesco;
	}

	public void setEduardoparentesco(String eduardoparentesco) {
		this.eduardoparentesco = eduardoparentesco;
	}

	public EduardoPessoa getEduardoPessoa() {
		return eduardopessoa;
	}

	public void setEduardoPessoa(EduardoPessoa eduardopessoa) {
		this.eduardopessoa = eduardopessoa;
	}
}
