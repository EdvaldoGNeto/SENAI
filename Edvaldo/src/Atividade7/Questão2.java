package Atividade7;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] ioup = new int[8];
			String outronome = "";
			for(int i = 0;i<ioup.length;i++) {
				System.out.println("Digite o "+(i+1)+ "º número inteiro: ");
				ioup[i] = sc.nextInt();
			}
			for(int i = 0;i<ioup.length;i++) {
				if(ioup[i] % 2 == 0) {
					outronome +=ioup[i]+" ";
				}else {
					outronome += "0" +" ";
				}
					
			}
			System.out.println(outronome);
			sc.close();
		
	}

}
