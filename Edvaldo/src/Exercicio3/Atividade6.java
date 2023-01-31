package Exercicio3;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Peso: ");
		double peso = sc.nextDouble();
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		sc.close();
		if(imc<18.5) {
		System.out.println("Voce esta Abaixo do Peso.");
		}else if(18.5<imc && imc<25) {
		System.out.println("Voce esta na media.");
		}else if(25<imc && imc<30) {
		System.out.println("Voce esta sobrepeso.");
		}else if(30<imc && imc<35) {
		System.out.println("Voce esta com Obesidade Grau 1.");
		}else if(35<imc && imc<40) {
		System.out.println("Voce esta com Obesidade Grau 2.");
		}else if(40<imc) {
		System.out.println("Voce esta com Obesidade Grau 3.");
		}
	}
}
		

