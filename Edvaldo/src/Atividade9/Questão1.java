package Atividade9;

import java.util.Scanner;

public class Questão1 {
	public static int soma(int[] numeros) {
		int soma = 0;
		for(int i = 0; i<numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite a quantidade de numeros á ser calculado: ");
		n = sc.nextInt();
		int[] numeros = new int[n];
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("Digite o "+(i+1)+" numero da lista: ");
			numeros[i] = sc.nextInt();
		}
		soma(numeros);
		System.out.println(soma(numeros));
		sc.close();
	}

}
