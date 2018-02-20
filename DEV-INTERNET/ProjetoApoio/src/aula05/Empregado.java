package aula05;

public abstract class Empregado {
	private String nome;
	private String telefone;

	public Empregado(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public abstract double calcularSalario();

	public String toString() {
		return String.format("%-20s%-20s%.2f", nome, telefone, calcularSalario());
	}
	// getters e setters omitidos
}