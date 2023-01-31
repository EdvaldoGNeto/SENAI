package Atividade11;

import java.util.Scanner;

public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	Scanner sc = new Scanner(System.in);
	
	Midia(){
		
	}
	
	Midia(int codigo, double preco, String nome){
		
	}
	
	public String getTipo() {
		return this.nome;
	}
	
	public String getDetalhes() {
		return new String(getTipo()+"\r\n"+getCodigo()+"\r\n"+ getPreco());
	}
	
	public void printDados() {
		System.out.println(getDetalhes());
	}
	
	public void inserirDados() {
		System.out.println("Nome: ");
		this.nome = sc.next();	
		System.out.println("Codigo: ");
		this.codigo = sc.nextInt();
		System.out.println("Preço: ");
		this.preco = sc.nextDouble();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
