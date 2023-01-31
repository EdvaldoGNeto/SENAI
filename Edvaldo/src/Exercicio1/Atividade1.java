package Exercicio1;

import java.util.Scanner;

public class Atividade1 {

	public Atividade1() {
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite a base do triangulo: ");
	double base = sc.nextInt();
	System.out.println("Digite a altura do triangulo: ");
	double altura = sc.nextInt();
	sc.close();
	double areatriangulo = (base * altura) / 2;
	System.out.println("A area do triangulo e " + areatriangulo);
		
	

	}

}
