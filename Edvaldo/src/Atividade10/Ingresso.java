package Atividade10;

public class Ingresso {
	public String nomeEvento;
	public double valorIngresso;
	
	public double exibirValor() {
		return valorIngresso;
	}
	
	public String imprimeEvento() {		
		return nomeEvento+valorIngresso;
	}
}
