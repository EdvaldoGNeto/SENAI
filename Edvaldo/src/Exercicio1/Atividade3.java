package Exercicio1;

import java.util.Scanner;

public class Atividade3 {

	public Atividade3() {
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o primeiro valor: ");
	double n1 = sc.nextDouble();
	System.out.println("Informe o segundo valor: ");
	double n2 = sc.nextDouble();
	sc.close();
	double soma = n1 + n2;
	double produto = n1*n2;
	System.out.println("A Soma e = " + soma + "e o produto e = " + produto);
		
		
	}

}
