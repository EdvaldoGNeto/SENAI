package Karine;

import java.util.ArrayList;
import java.util.List;

public class TesteContas {

	public static void main(String[] args) {
		List<Conta> ListaDeContas = new ArrayList(); // Criar ArrayList
		
		ListaDeContas.add(new ContaPoupanca()); //Criar A Lista
		ListaDeContas.add(new ContaEmpresarial());
		ListaDeContas.add(new ContaPoupanca());
		ListaDeContas.add(new ContaEmpresarial());
		ListaDeContas.add(new ContaPoupanca());
		
		ListaDeContas.get(0)
	}

}
