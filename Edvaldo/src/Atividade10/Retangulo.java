package Atividade10;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double calcularPerimetro() {
		double perimetro = 2*(this.altura*this.largura);
		return perimetro;
	}
	public double calcularArea() {
		double area = this.altura*this.largura;
		return area;
	}
}
