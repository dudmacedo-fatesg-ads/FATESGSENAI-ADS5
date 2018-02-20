package aula05;

public class EmpregadoComissionado extends Empregado {
	private double vendasBrutas;
	private double comissao;

	public EmpregadoComissionado(String nome, String telefone, double vendasBrutas, double comissao) {
		super(nome, telefone);
		this.vendasBrutas = vendasBrutas;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return vendasBrutas * comissao;
	}
	// getters e setters omitidos
}