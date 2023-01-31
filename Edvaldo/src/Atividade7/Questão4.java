package Atividade7;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 1;
		int timer = 0;
		int fatorial = 0;
		int i = 0;
		while(N<=1) {
			System.out.println("Digite um número inteiro maior que 1: ");
			N = sc.nextInt();
		}
		int[] numero = new int[N];
		for(i = 0; i<numero.length;i++) {
			System.out.println("Digite o "+(i+1)+ "º número: ");
			numero[i] = sc.nextInt();
		}
		//IMPAR
		if(numero.length %2 != 0) {
			int medianaimpar = (numero[(numero.length)/2]);
			timer=medianaimpar-1;	
			while(timer!=0) {
				fatorial += medianaimpar*timer;
				timer--;
			}
			System.out.println("O Fatorial de "+medianaimpar+" é igual á "+fatorial);
		//PAR
		}else {
			int medianapar = (numero[(numero.length/2)-1]+numero[(numero.length)/2])/2;
			timer=medianapar-1;	
			while(timer!=0) {
				fatorial += medianapar*timer;
				timer--;
			}
			System.out.println("O Fatorial de "+medianapar+" é igual á "+fatorial);
		}
		sc.close();
	}
}

