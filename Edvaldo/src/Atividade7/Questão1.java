package Atividade7;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] soun = new String[8];
		String outronome = "";
		for(int i = 0;i<soun.length;i++) {
			System.out.println("Digite o "+(i+1)+ "º número inteiro: ");
			soun[i] = sc.next();
		}
		for(int i = 0;i<soun.length;i++) {
			if(Integer.parseInt(soun[i])>0) {
				outronome += "true"+ " ";
			}else {
				outronome += "false"+ " ";
			}
				
		}
		System.out.println(outronome);
		sc.close();
	}

}


