package Exercicio3;

import java.util.Scanner;

public class Atividade2 {

	public Atividade2() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero positivo: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite o segundo numero positivo: ");
		double n2 = sc.nextDouble();
		if(n1<=0 && n2<=0) {
			System.out.println("Opção Inválida.");
		}else 
			System.out.println("1. Media ponderada, com pesos 2 e 3, respectivamente\r\n"
		+ "2. Quadrado da soma dos 2 numeros\r\n"
		+ "3. Cubo do menor numero "
		+ "Escolha uma opcao: ");
		int opcao = sc.nextInt();
		sc.close();
		switch (opcao) {
		
		case 1:
		double media = (n1*2+n2*3)/(n1+n2);
		System.out.println("A Media ponderada e = "+ media);
		break;
		case 2:
		double soma = n1+n2;
		double quadrado = Math.pow(soma, 2);
		System.out.println("O Quadrado da soma dos dois numeros e = "+ quadrado);
		break;
		case 3:
		if(n1>n2) {
			double cubo = Math.pow(n2, 3);
			System.out.println("O Cubo do menor numero = "+cubo);
		}else { 
			double cubo2 = Math.pow(n1, 3);
			System.out.println("O Cubo do menor numero = "+cubo2);
		}break;
		default: 
			System.out.println("Opção Inválida.");
		break;
			
		}
	}
}
