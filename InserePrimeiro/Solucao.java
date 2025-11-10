import java.util.Arrays; 
import java.util.Scanner; 

public class Solucao {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		String[] lista = sc.nextLine().split(" "); 
		int[] numeros = new int[lista.length];

		for (int i = 0; i < lista.length; i++) { 

			numeros[i] = Integer.parseInt(lista[i]);  		

	} 

	InserePrimeiro(numeros); 
	System.out.println(Arrays.toString(numeros)); 	

}

	public static void InserePrimeiro(int[] tokens){ 

		for (int i = 1; i < tokens.length; i++) {

			int j = i; 

		while (j > 0 && tokens[j] < tokens[j-1]) { 

			int aux = tokens[j]; 
			tokens[j] = tokens[j-1]; 
			tokens[j-1] = aux; 
			j--; 				

			}
		}	
	}		
}





