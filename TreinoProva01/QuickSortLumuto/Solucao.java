import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){

	int[] v = {5,4,1,2,5,12,13,4,6,10,21,1,3,0,0,7};
	quickSort(v,0,v.length-1);
	System.out.println(Arrays.toString(v));
}

	public static void quickSort(int[] v, int left, int right){ 

		if (left>=right) return; 
		int idxpivo = particiona(v,left,right); 
		quickSort(v,left,idxpivo-1);
		quickSort(v,idxpivo+1,right);
}

	public static int particiona(int[] v, int left, int right){ 

		int i = left; 
		int pivot = v[left]; 
		
		for(int j = left + 1; j<=right; j++){ 
			if(v[j] <= pivot){ 
				i++; 
				swap(v,i,j);
			}
		}
		swap(v,left,i);
		return i; 
	}

	public static void swap(int[] v, int i, int j){
		
		int aux = v[i];
		v[i] = v[j]; 
		v[j] = aux; 

	}
}
