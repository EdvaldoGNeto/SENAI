package ListadeRevisao1;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	PessoaFisica(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
