package Atividade11;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, String sobrenome){
		setNome(this.nome);
		setSobrenome(this.sobrenome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.nome+" "+this.sobrenome;
	}
}
