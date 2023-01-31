package Exercicio1;

import java.util.Scanner;

public class Atividade4 {

	public Atividade4() {
		
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double salariobase = 1500;
System.out.println("Qual o nome do corretor? ");
String nome = sc.next();
System.out.println("Quantos imoveis foram vendidos? ");
int numimvend = sc.nextInt();
sc.close();
double porcentagem = 20000*0.05;
double comissao = 200*numimvend;
double salario = salariobase + porcentagem + comissao;
System.out.println("O Salario de " + nome + "é = " + salario);
	
	
	
	
		

	}

}
