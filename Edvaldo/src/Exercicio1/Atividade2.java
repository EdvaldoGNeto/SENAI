package Exercicio1;

import java.util.Scanner;

public class Atividade2 {

	public Atividade2() {
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double pi = 3.14;
	System.out.println("Informe o raio da circunferencia: ");
	int raio = sc.nextInt();
	sc.close();
	double compcirc = 2*pi*raio;
	System.out.println("O Comprimento da circuferencia é = " + compcirc);
				
	
	}

}
