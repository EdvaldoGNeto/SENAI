package Karine;

public class ContaPoupanca extends Conta {
	private double taxaDeJuros;
	
	void atualizarSaldo(double valor) {
		setSaldo(valor + valor*taxaDeJuros);
	}
}
