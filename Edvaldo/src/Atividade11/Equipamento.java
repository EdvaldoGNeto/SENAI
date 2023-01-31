package Atividade11;

public class Equipamento {
	private boolean ligado;
	
	public boolean ligar() {
		this.ligado = true;
		return this.ligado;
	}
	
	public boolean desligar() {
		this.ligado = false;
		return this.ligado;
	}
	
}
