package ListadeRevisao1;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void displayData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}


