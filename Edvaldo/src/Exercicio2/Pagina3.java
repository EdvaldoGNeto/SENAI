package Exercicio2;

import java.util.Scanner;

public class Pagina3 {

	public Pagina3() {
		
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Informe a quantidade de anos: ");
int anos = sc.nextInt();
System.out.println("Informe a quantidade de meses: ");
int meses = sc.nextInt();
System.out.println("Informe a quantidade de dias: ");
int dias = sc.nextInt();
sc.close();
int total = (anos*365)+(meses*30)+dias;
System.out.println("O Total de dias = "+total);




	}

}
