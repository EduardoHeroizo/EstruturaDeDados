public class Solucao{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length];
		
		for (int i = 0; i < linha.length; i++){

			numeros[i] = Integer.parseInt(linha[i]);
		}	 
	}
}
