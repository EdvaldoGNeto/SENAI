package Exercicio3;

import java.util.Scanner;

public class Atividade5 {

	public Atividade5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique o primeiro valor: ");
		int va1 = sc.nextInt();
		System.out.println("Indique o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Indique o terceiro valor: ");
		int va3 = sc.nextInt();
		sc.close();
		
		if(va1==valor2 || valor2==va3 || va3==va1) {
		System.out.println("Tem pelo menos 2 pessoas com a mesma estatura");
		}else if(va1>valor2) {			
				if(va1>va3) {
						System.out.println(va1+" tem a maior altura.");
				}
				else {
						System.out.println(va3+" tem a maior altura");	
				}
			
		}else {
			if(valor2>va3) {
				System.out.println(valor2+" tem a maior altura");
			}else{
				System.out.println(va3+" tem a maior altura");
			}
		}
	}
}
