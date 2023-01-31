package Atividade9;

import java.util.Scanner;

public class Questão4 {
	public static double valorPagamento(double valorp, double diasa){
		double valorpago = 0;
		if(diasa!=0) {
			valorpago +=	valorp+(valorp*0.03+(0.001*diasa));
		}else {
			valorpago += valorp;
		}
		return valorpago;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean menuIniciar = true;
		int contagem = 0;
		double valortotal = 0;
		while(menuIniciar) {
			System.out.println("Escolha uma opção: \r\n"
					+"1. Nova Prestação.\r\n"
					+"0. Sair");
			int opcao = sc.nextInt();
			switch(opcao) {
			case 1:			
				System.out.println("Valor da prestação: ");
				double valorp = sc.nextDouble();
				System.out.println("Dias de atraso: ");
				double diasa = sc.nextDouble();
				System.out.println("O Valor a ser pago é "+valorPagamento(valorp, diasa));
				valortotal += valorPagamento(valorp, diasa);
				contagem++;
					break;
			case 0:
				menuIniciar = false;
					break;
			default:
				menuIniciar = false;
				break;
			}
	
		}
		System.out.println("Voce tem "+contagem+" para pagar.\r\n"
				+ "Valor total igual "+valortotal);
		sc.close();
	}

}
