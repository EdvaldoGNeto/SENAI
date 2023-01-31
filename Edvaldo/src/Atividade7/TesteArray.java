package Atividade7;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] convidados = new String[10];
		String listaFinal = "Os convidados da festa são ";
		for (int i = 0 ; i < convidados.length; i++) {
			System.out.println("Digite o "+ (i+1) + "º nome: ");//for normal
			convidados[i] = sc.next();
		}
		for(int i = 0; i < convidados.length;i++) {
			listaFinal = listaFinal + convidados[i]+" ";// for normal		
	
		}
		String listaFinal2 = "Os convidados da festa são ";
		for (String convidado: convidados) {//for each
			listaFinal2 += convidado + " ";
		}
		System.out.println(listaFinal2);
		sc.close();
	}

}
