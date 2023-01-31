package Exercicio3;

import java.util.Scanner;

public class Atividade3 {

	public Atividade3() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Login: ");
		String login = sc.next();
		System.out.println("Senha: ");
		int senha = sc.nextInt();
		sc.close();
		if(login.equals("procopio")  && senha==12345) {
			System.out.println("Seja Bem-vindo.");
		}else { 
			if(login.equals("paiva") && senha==54321) {
				System.out.println("Seja Bem-vindo.");
			}else{
				System.out.println("Login ou senha nao conferem.");
			}
			
		}
		
	}

}
