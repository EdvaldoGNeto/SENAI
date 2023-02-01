package ListadeReviasao2;

import java.util.Scanner;

public class Luz {
	public int dia;
	public int mes;
	public int ano; 
	public double kw;
	
	public String dataDeLeitura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dia, mês e ano: ");
		this.dia = sc.nextInt();
		this.mes = sc.nextInt();
		this.ano = sc.nextInt();
		return (this.dia + "/" + this.mes + "/" +this.ano);
	}
	
	public int kwGasto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos KW foram gastos: ");
		this.kw = sc.nextDouble();
		return this.kw;
	}
}
