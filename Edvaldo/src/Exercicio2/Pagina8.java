package Exercicio2;

import java.util.Scanner;

public class Pagina8 {

	public Pagina8() {
		
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Informe o total de eleitores: ");	
double eleitorest = sc.nextInt();
System.out.println("Informe votos brancos: ");
double vb = sc.nextInt();
System.out.println("Informe votos nulos: ");
double vn = sc.nextInt();
System.out.println("Informe votos validos: ");
double vv = sc.nextInt();
sc.close();
double percentualvb = (vb/eleitorest)*100;
double percentualvn = (vn/eleitorest)*100;
double percentualvv = (vv/eleitorest)*100;
System.out.println("Os Percentuais de Votos Brancos, Nulos e Validos são respectivamente: "+ percentualvb + ", "+ percentualvn + ", "+ percentualvv);



     
		

	}

}
