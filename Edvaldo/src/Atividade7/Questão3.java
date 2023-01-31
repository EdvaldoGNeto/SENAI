package Atividade7;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] atletas = new String[7];
		int[] tempo = new int[7];
		int mtempo = 0;
		int ptempo = 999;
		int ttempo = 0;
		for(int i = 0; i <atletas.length;i++) {
			System.out.println("Digite o "+(i+1)+ "º Atleta: ");
			atletas[i] = sc.next();
			System.out.println("Digite o "+(i+1)+ "º Tempo do Atleta: ");
			tempo[i] = sc.nextInt();
			ttempo += tempo[i];
			if(tempo[i]>mtempo) {
				mtempo = tempo[i];
			}else if(ptempo>tempo[i]) {
				ptempo = tempo[i];
			}
			
		}
		double media = ttempo/atletas.length;
		System.out.println("O Melhor tempo foi: "+mtempo+" , O Pior tempo foi: "+ptempo+" e a média foi: "+media);
		sc.close();
		
	}

}
