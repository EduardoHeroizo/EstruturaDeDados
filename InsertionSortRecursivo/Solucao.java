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
		InsertionRecursivo(numeros,1);
	}

	public static void InsertionRecursivo(int[] tokens, int n){

		if (n == tokens.length) return; 
		int j = n; 

		while (j > 0 && (tokens[j] < tokens[j-1])){

			int temp = tokens[j]; 	
			tokens[j] = tokens[j-1];
			tokens[j-1] = temp;
			j--;
		}
		System.out.println(Arrays.toString(tokens));
		InsertionRecursivo(tokens, n+1);	
	}
}
