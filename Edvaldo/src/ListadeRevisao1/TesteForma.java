package ListadeRevisao1;

public class TesteForma {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(2, 2);
		Circulo c1 = new Circulo(3);
		System.out.println(r1.caclcularArea());
		System.out.println(r1.caclcularPerimetro());
		System.out.println(c1.caclcularArea());
		System.out.println(c1.caclcularPerimetro());
	}

}
