package ListadeRevisao1;

public class TestarPessoa {

	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica("128.876.904-23");
		PessoaJuridica p2 = new PessoaJuridica("128.876.903-24");
		p1.getCpf();
		p2.getCnpj();	}

}
