import java.util.Scanner;
import java.util.Arrays; 

public class Solucao { 

	public static void main(String[] args){ 
		
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(","); 
		selectionSortMariana(linha); 
		System.out.println(Arrays.toString(linha)); 		
	}
	
	public static void selectionSortMariana(String[] arr){
		 
		for (int i = 0; i < arr.length; i++) {
 
                	int menorIndex = i;  			

                        for (int j = i + 1; j < arr.length; j++){
 
				System.out.println(Arrays.toString(arr));
                                if (arr[menorIndex].compareTo(arr[j]) > 0){
                                	menorIndex = j;
				
				}
			}

			if (menorIndex != i){		
				
				String tempo = arr[i]; 
				arr[i] = arr[menorIndex]; 
				arr[menorIndex] = tempo;
			
			}	
		}
	}
} 
