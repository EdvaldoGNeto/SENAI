package Exercicio1;

import java.util.Scanner;

public class Atividade6 {

	public Atividade6() {
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o primeiro valor inteiro positivo: ");
	int n1 = sc.nextInt();
	System.out.println("Informe o segundo valor inteiro positivo: ");
	int n2 = sc.nextInt();
	sc.close();
	double ncubo = Math.pow(n2, 3);
	double raiz = Math.pow(Math.sqrt(n1+n2), 2);
	System.out.println("O Cubo de " + n2 + " = " + ncubo + " A Raiz entre os dois numeros = " + raiz);
		
	

	}

}
