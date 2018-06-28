package br.com.senai.entidade;

import javax.persistence.*;

@Entity
@Table(name="note")
public class Notebook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String serialNumber;
	
	private int memoriaRAM;
	
	private int espacoHD;
	
	@ManyToOne
	private Pessoa pessoa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getEspacoHD() {
		return espacoHD;
	}

	public void setEspacoHD(int espacoHD) {
		this.espacoHD = espacoHD;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
