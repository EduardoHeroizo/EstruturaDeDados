import java.util.Scanner; 
import java.util.Arrays; 

public class Solucao{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 
		String linha = sc.nextLine();
		String[] partes = linha.split(" ");
		int numeros[] = new int[partes.length];

		for (int i = 0; i < partes.length;i++){ 

			numeros[i] = Integer.parseInt(partes[i]); 
	}

	InsereOrdenada(numeros); 
	System.out.println(Arrays.toString(numeros)); 

}

	public static void InsereOrdenada(int[] tokens){
	
		int ultimoValor = tokens.length - 1; 
		
		while (ultimoValor > 0 && tokens[ultimoValor] <= tokens[ultimoValor-1]){
			
			int aux = tokens[ultimoValor]; 
			tokens[ultimoValor] = tokens[ultimoValor - 1]; 	
			tokens[ultimoValor - 1] = aux; 
			ultimoValor--; 			

		}	
	}
}
