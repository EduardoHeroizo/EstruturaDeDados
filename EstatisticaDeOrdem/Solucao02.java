import java.util.Scanner; 

public class Solucao02{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length]; 
		
		for (int i = 0; i < linha.length; i++){

			numeros[i] = Integer.parseInt(linha[i]); 
		} 
	
	System.out.println(estatisticaOrdem(numeros));
	
}

	public static int estatisticaOrdem(int[] v){ 
	
		int pivot = v[0];
		int count = 1;
		for (int i = 1; i < v.length; i++){
			if (v[i] < pivot){
			count++;
			}
		}
		return count; 
	}
}
