package aula05;

public class EmpregadoHorista extends Empregado {
	private int qtdHorasTrab;
	private double valorHora;

	public EmpregadoHorista(String nome, String telefone, int qtdHorasTrab, double valorHora) {
		super(nome, telefone);
		this.qtdHorasTrab = qtdHorasTrab;
		this.valorHora = valorHora;
	}

	public double calcularSalario() {
		return qtdHorasTrab * valorHora;
	}
	// getters e setters omitidos
}