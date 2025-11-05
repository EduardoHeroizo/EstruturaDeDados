import java.util.Scanner;
import java.util.Arrays; 

public class Solucao{ 

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length];

		for (int i = 0; i < linha.length; i++){
			numeros[i] = Integer.parseInt(linha[i]); 
			
		}
		
		SelectionSort(numeros);
		System.out.println(Arrays.toString(numeros));
		
	}

	public static void SelectionSort(int[] tokens){
		
		for (int i = 0; i < tokens.length - 1; i++){
			
			int menorIdx = i;
 
			for (int j = i + 1; j < tokens.length; j++){
		
				if (tokens[menorIdx] > tokens[j]){
					menorIdx = j; 

				}			 
			}
			
			System.out.println(Arrays.toString(tokens));
			int temp = tokens[menorIdx]; 
			tokens[menorIdx] = tokens[i]; 
			tokens[i] = temp; 	
		
		} 		
	}	
}
