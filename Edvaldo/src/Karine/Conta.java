package Karine;

public class Conta {
	private int numero;
	private double saldo;
	
	void saque(double valor) {
		saldo -= valor;
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void deposito(double valor) {
		saldo += valor;
	}
	
}

