package ListadeRevisao1;

public class Retangulo extends Forma{
	private double lado;
	private double altura;
	
	Retangulo(double lado, double altura){
		this.lado = lado;
		this.altura = altura;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	@Override
	public double caclcularArea() {
		double aRetan = this.lado * this.altura;
		return aRetan;
	}

	@Override
	public double caclcularPerimetro() {
		double pRetan = (this.lado*2) + (this.altura*2);
		return pRetan;
	}

}
