package br.com.senai.entidade;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="pes")
@SecondaryTable(name="empresa", pkJoinColumns = { @PrimaryKeyJoinColumn(name="id")})
public class Pessoa {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="pes_nome")
	private String nome;
	
	@Column(name= "emp_nome", table = "empresa")
	private String nomeEmpresa;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Notebook> notebooks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public List<Notebook> getNotebooks() {
		return notebooks;
	}

	public void setNotebooks(List<Notebook> notebooks) {
		this.notebooks = notebooks;
	}
		
}
