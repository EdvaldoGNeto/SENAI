package ListadeRevisao1;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	PessoaJuridica(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
