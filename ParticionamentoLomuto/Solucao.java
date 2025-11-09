import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){
	
	int[] v = {5,4,2,3,10,51};
	quickSort(v,0,v.length-1);
	System.out.println(Arrays.toString(v));

	}

	public static void quickSort(int[] v, int left, int right){ 

		if (left < right){ 
		
		int valorPivo = partition(v,left,right); 
		quickSort(v, valorPivo + 1, right); 
		quickSort(v,left, valorPivo - 1); 
	
	}
}

	public static int partition(int[] v, int left, int right){ 

	int pivot = v[left]; 	
	int i = left; 

	for (int j = left + 1; j <= right; j++){
		if (v[j] <= pivot){ 
			i++; 
			swap(v,i,j); 
			}	
		}
	swap(v,left,i);
	return i; 
	 }
	
	public static void swap(int[] v, int i, int j){
		int temp = v[i]; 
		v[i] = v[j]; 
		v[j] = temp; 
	}
}
