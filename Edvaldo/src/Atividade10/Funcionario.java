package Atividade10;

public class Funcionario {
	public String nome;
	public double salario;
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	public double aumentarSalario(double porcentagem) {
		double decimal = porcentagem/100;
		double aumentarSalario = this.salario*decimal;
		return aumentarSalario;
	}
}
