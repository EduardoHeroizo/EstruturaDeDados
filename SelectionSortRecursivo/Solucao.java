import java.util.Arrays; 
import java.util.Scanner;

public class Solucao{ 

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in); 
		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length]; 
			
		for (int i = 0; i < linha.length; i++){

			numeros[i] = Integer.parseInt(linha[i]);
			
		}

		SelectionSortRecursivo(numeros, 0); 
		System.out.println(Arrays.toString(numeros)); 
 
	}

	public static void SelectionSortRecursivo(int[] tokens, int n){
		
		if (n == tokens.length - 1) return; 

		int indiceMenor = n; 

		for (int j = n + 1; j < tokens.length; j++){
			
			if (tokens[j] < tokens[indiceMenor]){

				System.out.println(Arrays.toString(tokens));
				int temp = tokens[j];
				tokens[j] = tokens[indiceMenor];
				tokens[indiceMenor] = temp; 
				
				}				
			}

		SelectionSortRecursivo(tokens, n + 1); 
		
	}
}
