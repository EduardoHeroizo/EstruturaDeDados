import java.util.Scanner;

public class Solucao{ 

	public static void main(String[] args){ 

		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt(); 
		sc.nextLine(); 

		String[] linha = sc.nextLine().split(" "); 
		int[] numeros = new int[linha.length]; 
		
		for (int i = 0; i < linha.length; i++){

			numeros[i] = Integer.parseInt(linha[i]); 

		} 

		PosicoesElemento(num, numeros); 
	
	}

	public static void PosicoesElemento(int num, int[] numeros){
		
		String resultado = "";  
		for (int i = 0; i < numeros.length; i++){

			if (num == numeros[i]){
				resultado = resultado + i + " ";  
			}
		}
		if (!resultado.equals("")){
			System.out.println(resultado.trim()); 
		} else { 
			System.out.println(-1); 
		}
	}
}
