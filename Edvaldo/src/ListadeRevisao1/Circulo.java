package ListadeRevisao1;

public class Circulo extends Forma {
	private double raio;
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double caclcularArea() {
		double aCirculo = Math.PI * Math.pow(this.raio, 2);
		return aCirculo;
	}

	@Override
	public double caclcularPerimetro() {
		double pCirculo = (2* Math.PI) * this.raio;
		return pCirculo;
	}

}
