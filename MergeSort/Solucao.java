import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){

	int[] v = {2,4,6,4,1,5,7,1,19,4,5,23,4};
	MergeSort(v,0,v.length - 1); 
	System.out.println(Arrays.toString(v)); 
	}

	
	public static void MergeSort(int[] v, int ini, int fim){
		
		if (ini >= fim) return; 

		int meio = (ini + fim) / 2; 
		
		MergeSort(v, ini, meio);
		MergeSort(v, meio + 1, fim); 
		merge(v,ini,meio,fim);
	
	} 


	public static void merge(int[] v, int ini, int meio, int fim){
		
		int[] helper = new int[v.length];
		
		for (int i = 0; i < v.length;i++){
			helper[i] = v[i];
		}
		
		int i = ini; 
		int k = ini; 
		int j = meio + 1;   
		
		while (i <= meio && j <= fim){ 
			if (helper[i] <= helper[j]){
				v[k] = helper[i]; 		
				k++; 
				i++;
			} else { 
			v[k] = helper[j];
			j++; 
			k++; 		
			
			}
		}
	
	while (i < meio + 1){
		v[k] = helper[i];
		k++;
		i++; 
		}
 	while (j < fim){
                  v[k] = helper[j];
                  k++;
                  j++;
		}
	} 
}
