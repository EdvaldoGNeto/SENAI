package Atividade9;

import java.util.Scanner;

public class Questão2 {
	public static int fatorial(int num) {
		int contagem = num-1;
		while(contagem !=1) {
			num *= contagem;
			contagem--;
		}
	
	return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Forneça um número: ");
		int num = sc.nextInt();
		System.out.println(fatorial(num));
		sc.close();
	}

}
