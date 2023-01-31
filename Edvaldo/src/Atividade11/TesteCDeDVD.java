package Atividade11;

import java.util.Scanner;

public class TesteCDeDVD {

	public static void main(String[] args) {
		Midia m1 = new CD();
		Midia m2 = new DVD();
		Scanner sc = new Scanner(System.in);
		boolean menuIniciar = true;
		while(menuIniciar) {
			System.out.println("Escolha oque deseja cadastrar: \r\n"
					+ "1. DVD\r\n"
					+ "2. CD\r\n"
					+ "0. Sair");
			int opcao = sc.nextInt();
			switch(opcao) {
				case 1:
					m1.inserirDados();
					m1.printDados();
						break;
				case 2: 
					m2.inserirDados();
					m2.printDados();
						break;
				case 0:
					menuIniciar = false;
						break;
				default:
					System.out.println("Valor Invalido tente novamente.");
						break;
			}
		}
		sc.close();
	}

}
