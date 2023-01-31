package Atividade7;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] L = new double[7];
		double menorElemento=0d;
		double maiorElemento=0d;
		for(int i = 0; i<L.length;i++) {
			System.out.println("Digite o "+(i+1)+ "º número: ");
			L[i] = sc.nextInt();
			if(i==0) {
				 menorElemento = L[0];
				 maiorElemento = L[0];
			}			
			if(L[i]>maiorElemento) {
				maiorElemento = L[i];
				System.out.println("Maior elemento: "+maiorElemento);
			}else if(L[i]<menorElemento) {
				menorElemento = L[i];
				System.out.println("Menor elemento: "+menorElemento);
			}
		}
		System.out.println(maiorElemento);
		System.out.println(menorElemento);
		double geo = Math.sqrt(maiorElemento+menorElemento);
		System.out.println("A Raiz geométrica é igual á "+ geo);
		sc.close();
	}

}
