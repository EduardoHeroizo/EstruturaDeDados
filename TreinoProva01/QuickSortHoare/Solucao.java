import java.util.Arrays; 

public class Solucao{
	
	public static void main(String[] args){

		int[] v = {4,42,45,1,2,0,6,5,4,62,1,0,6};
		quickSort(v,0,v.length-1);
		System.out.println(Arrays.toString(v));

}

	public static void quickSort(int[] v, int left, int right){

		if (left >= right) return;
		int idxpivot = particiona(v,left,right); 
		quickSort(v,left,idxpivot-1);
		quickSort(v,idxpivot+1,right); 

}

	public static int particiona(int[] v, int left,int right){ 

		int pivot = v[left]; 
		int i = left + 1; 
		int j = right; 

		while(i <= j){ 
	
			while(i <= j && v[i] <= pivot){ 
				i++; 
				}
			while(i <= j && v[j] > pivot){
				j--;
		}
		if (i < j){ 
			swap(v,i,j);
		} 
	}
		swap(v,left,j);
		return j; 
	}


	public static void swap(int[] v, int i, int j){ 

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
