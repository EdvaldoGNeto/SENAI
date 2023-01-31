package Atividade11;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Funcionario pessoa2 = new Funcionario();
		Professor pessoa3 = new Professor();
		pessoa1.setNome("Mario");
		pessoa1.setSobrenome("Lopes");
		pessoa2.setNome("Lucas");
		pessoa2.setSobrenome("Mendes");
		pessoa2.setSalario(2000);
		pessoa3.setNome("Rafael");
		pessoa3.setSobrenome("Lira");
		pessoa3.setSalario(500);
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		System.out.println(pessoa2.getSalarioPrimeiraParcela());
		System.out.println(pessoa2.getSalarioSegundaParcela());
		System.out.println(pessoa3.getSalarioPrimeiraParcela());
		System.out.println(pessoa3.getSalarioSegundaParcela());
		
	}

}
