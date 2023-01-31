package Atividade11;

public class DVD extends Midia {
	public int numFaixas;
	
	DVD(){
		
	}
	
	DVD(int codigo, double preco, String nome){
		
	}
	
	@Override
	public String getTipo() {
		return "DVD";

	}
	
	@Override
	public String getDetalhes() {
		return super.getDetalhes()+"\r\n"+this.numFaixas;		
	}
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("Número de faixas: ");
		this.numFaixas = sc.nextInt();
	}
	
}
