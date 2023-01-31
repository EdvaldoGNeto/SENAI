package Atividade11;

public class Professor extends Funcionario {
	
	@Override
	public double getSalarioPrimeiraParcela() {
		
		return getSalario();		
	}
	
	@Override
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
