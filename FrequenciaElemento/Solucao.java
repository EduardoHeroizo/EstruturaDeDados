import java.util.Scanner; 

public class Solucao {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
		int numero = sc.nextInt(); 
		sc.nextLine(); 
		
		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length];		

		for (int i = 0; i < linha.length; i++){

			numeros[i] = Integer.parseInt(linha[i]); 

	}
		System.out.println(frequenciaElemento(numero, numeros)); 	
}



	public static int frequenciaElemento(int n, int[] numeros){

		int count = 0; 
		
		for (int num: numeros){
			if (num == n) {
				count++; 
			}
		}
		return count; 
	}
}

