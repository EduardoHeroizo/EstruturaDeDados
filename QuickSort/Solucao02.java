// Utilizando particionamento Hoare

public class Solucao02{

	public static int partitionHoare(int[] v, int left, int right){

		int pivot = v[left];
		int i = left + 1; 
		int j = right; 

		while(i <= j){

			while (i <= j && v[i] <= pivot){
				i++;
			}	
			while (i <= j && v[j] > pivot){ 
				j--;
}
		if (i<j){ 
			swap(v,i,j);
	}
}
	swap(v,left,j); 
	return j; 
}

	public static void swap(int[] v, int left, int right){

		int aux = v[left]; 
		v[left] = v[right];
		v[right] = aux;	
}
