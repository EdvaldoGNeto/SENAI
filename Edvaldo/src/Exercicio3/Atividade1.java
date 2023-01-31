package Exercicio3;

import java.util.Scanner;

public class Atividade1 {

	public Atividade1() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		double n1 = sc.nextDouble();
		sc.close();
	if(n1<=0) {
		System.out.println("Opção Inválida.");
	}else {	
		if(n1 % 2==0) {
			double par = Math.pow(n1, 2);
			System.out.println("O Resultado par e = "+ par);
		}else {
			double impar = Math.pow(n1, 3);
			System.out.println("O Resultado impar e = " + impar);
		}	
	}	
	
	
	
	
	
	
	}
	
	
	
		
	}	
		
		

	
