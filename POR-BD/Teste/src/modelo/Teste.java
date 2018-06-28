package modelo;

import java.util.Calendar;

import javax.persistence.*;

@Entity
public class Teste {
	
	@Id
	@GeneratedValue
	private long codigo;
	
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataCadastro;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
