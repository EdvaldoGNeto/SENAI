package Atividade11;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(this.matricula>0) {
			System.out.println("Valores impossiveis.");
		}else {
			this.salario = salario;
		}

	}
	
	public double getSalarioPrimeiraParcela() {
		double getSalarioPrimeiraParcela = this.salario*0.6;
		return getSalarioPrimeiraParcela;
	}
		
	public double getSalarioSegundaParcela() {
		double getSalarioSegundaParcela = this.salario*0.4;
		return getSalarioSegundaParcela;
	}

}
