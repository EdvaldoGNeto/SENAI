package ListadeRevisao1;

import java.util.Scanner;

public class cpfs {
	public void adicionar(int vetor[]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<vetor.length; i++){
			System.out.println("Escreva o "+(i+1)+" Numero:");
			int n =sc.nextInt();
			vetor[i] =  n;
		}
		sc.close();
	}
	public void listar(int vetor[]) {
		for(int i = 0; i<vetor.length; i++){
			System.out.println(vetor[i]);
		}
	}

	public static void main(String[] args) {
		cpfs cpf = new cpfs();
		int[] vetor = new int[4];
		cpf.adicionar(vetor);
		cpf.listar(vetor);
	}
	
}
