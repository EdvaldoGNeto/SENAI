package Atividade10;

public class Carro {
	public double consumo;
	public double combustivel;
	Carro(double consumo, double combustivel){
		this.combustivel = 0;
		this.consumo = consumo;
	}
	public void andar(){
		if(this.combustivel==0) {
			System.out.println("Voce não tem combustivel o suficiente.");							
		}else {
			double andar = this.consumo/this.combustivel;
			this.combustivel = andar*this.combustivel;
			System.out.println("No Passeio foi gasto "+this.combustivel+"KM/L.");
		}		
	}
	public double exibirCombustivel() {
		return combustivel;
	}
	public void abastecer(double litros) {
		System.out.println("Abastecendo "+litros+"/l.");
		combustivel += litros;
	}
}
