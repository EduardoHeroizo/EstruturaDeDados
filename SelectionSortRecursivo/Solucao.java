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
 
	}

	public static void SelectionSortRecursivo(int[] tokens, int n){
		
		
		if (n == tokens.length - 1) return; 

		int indiceMenor = n; 

		for (int j = n + 1; j < tokens.length; j++){
			
			if (tokens[j] < tokens[indiceMenor]){
				indiceMenor = j;  
				
				}
			}
			
			int temp = tokens[indiceMenor];
			tokens[indiceMenor] = tokens[n];
			tokens[n] = temp; 				
			
		System.out.println(Arrays.toString(tokens));
		SelectionSortRecursivo(tokens, n + 1); 
		
	}
}
