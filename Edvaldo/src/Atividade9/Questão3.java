package Atividade9;

import java.util.Scanner;

public class Questão3 {
	public static double atriangulo() {
		@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Qual a base do triangulo? ");
	double btrian = sc.nextDouble();
	System.out.println("Qual a altura do triangulo? ");
	double atrian = sc.nextDouble();
	double areatriangulo = (btrian*atrian)/2;
	return areatriangulo;
	}
	public static double acirculo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o raio do circulo? ");
		double rdocirculo = sc.nextDouble();
		double pi = 3.14;
		double acirculo = pi*(Math.pow(rdocirculo, 2));
		return acirculo;
	}
	public static double aretangulo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a base do retangulo? ");
		double bretan = sc.nextDouble();
		System.out.println("Qual a altura do retangulo? ");
		double alretan = sc.nextDouble();
		double aretan = bretan*alretan;
		return aretan;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean menuIniciar = true;
		int opcao;
		while(menuIniciar) {
			System.out.println("Calculo das areas de figuras geometricas:\r\n"
					+ "1. Triangulo\r\n"
					+ "2. Circulo\r\n"
					+ "3. Retangulo\r\n"
					+ "4. Sair\r\n"
					+ "Qual figura deseja calcular a area?");
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("A Area do triangulo é : "+atriangulo());
				menuIniciar = false;
				break;
			case 2:
				System.out.println("A Area do circulo é : "+acirculo());
				menuIniciar = false;
				break;
			case 3:
				System.out.println("A Area do circulo é : "+aretangulo());
				menuIniciar = false;
				break;
			case 4:
				menuIniciar = false;
				break;
			}
		}
		sc.close();
	}

}
