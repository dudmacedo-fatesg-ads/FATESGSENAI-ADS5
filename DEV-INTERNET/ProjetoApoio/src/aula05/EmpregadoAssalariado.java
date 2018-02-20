package aula05;

public class EmpregadoAssalariado extends Empregado {
	private double salario;

	public EmpregadoAssalariado(String nome, String telefone, double salario) {
		super(nome, telefone);
		this.salario = salario;
	}

	public double calcularSalario() {
		return salario;
	}
}