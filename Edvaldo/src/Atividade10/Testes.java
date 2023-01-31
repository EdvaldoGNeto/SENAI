package Atividade10;

public class Testes {

	public static void main(String[] args) {
		Ingresso evento1 = new Ingresso();
		evento1.nomeEvento = ("Festa");
		evento1.valorIngresso = (25.00);
		System.out.println(evento1.imprimeEvento());
		Retangulo calculo1 = new Retangulo();
		calculo1.altura = (2.0);
		calculo1.largura = (3.0);
		System.out.println(calculo1.calcularPerimetro());
		System.out.println(calculo1.calcularArea());
		Calculadora calcular1 = new Calculadora(2, 2);
		calcular1.somar();
		System.out.println("Soma é "+calcular1.somar());
		calcular1.subtrair();
		System.out.println("Soma é "+calcular1.subtrair());
		calcular1.multiplicar();
		System.out.println("Soma é "+calcular1.multiplicar());
		calcular1.dividir();
		System.out.println("Soma é "+calcular1.dividir());
		calcular1.calcularPotencia();
		System.out.println("Soma é "+calcular1.calcularPotencia());
		Funcionario salario1 = new Funcionario("Jorge", 1500.00);
		Funcionario salario2 = new Funcionario("Borges", 1000.00);
		System.out.println("O Salário é "+salario1.aumentarSalario(20));
		System.out.println("O Salário é "+salario2.aumentarSalario(50));
		Carro carro1 = new Carro(2, 2);
		System.out.println(carro1.exibirCombustivel());
		carro1.abastecer(10);
		carro1.andar();
		
		}

}
