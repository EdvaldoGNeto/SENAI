package Extra;

public class Extra1 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int j = vetor.length-1;
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("nº "+(i+1) +" valor: "+lista[i]+" nº: "+j+" valor: "+lista[j]);
			lista[i] = lista[j];
			j--;
		}
		System.out.println();
	}

}
