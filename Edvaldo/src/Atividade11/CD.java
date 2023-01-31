package Atividade11;

public class CD extends Midia{
	public int numMusicas;
	
	CD(){
		
	}
	
	CD(int codigo, double preco, String nome){
		
	}
	
	@Override
	public String getNome() {
		return "CD";
	}
	@Override
	public String getDetalhes() {
		return super.getDetalhes()+"\r\n"+this.numMusicas;		
	}
	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("Número de Musicas: ");
		this.numMusicas = sc.nextInt();
	}
	
}
