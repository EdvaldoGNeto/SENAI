package Exercicio1;

import java.util.Scanner;

public class Atividade5 {

	public Atividade5() {
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe A: ");
	double a = sc.nextDouble();
	System.out.println("Informe B: ");
	double b = sc.nextDouble();
	System.out.println("Informe C: ");
	double c = sc.nextDouble();
	sc.close();
	b = Math.pow(b, 2);
	double delta = b-4*a*c;
	System.out.println("O Valor de delta = " +  delta);

	
	
		

	}

}
