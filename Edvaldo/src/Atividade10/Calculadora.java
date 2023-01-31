package Atividade10;

public class Calculadora {
	public double op1;
	public double op2;
	Calculadora(double op1, double op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	public double somar() {
		double somar = this.op1+this.op2;
		return somar;
	}
	public double subtrair() {
		double subtrair = this.op1-this.op2;
		return subtrair;
	}
	public double multiplicar() {
		double multiplicar = this.op1*this.op2;
		return multiplicar;
	}
	public double dividir () {
		double dividir = this.op1/this.op2;
		return dividir;
	}
	public double calcularPotencia() {
		double calcularPotencia = Math.pow(op1, op2);
		return calcularPotencia;
	}
}
