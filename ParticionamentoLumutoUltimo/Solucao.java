import java.util.Arrays;

public class Solucao{ 

	public static void main(String[] args){

		int[] nums = {9, 5, 1, 8, 2, 6};
		quickSort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums)); 
		}

	public static void quickSort(int[] v, int left, int right){

	if (left < right){ 

		int indexPivot = partition(v,left,right); 
		quickSort(v,indexPivot+1,right); 
		quickSort(v,left,indexPivot-1); 		
	}
}

	public static int partition(int[] v, int left, int right){ 

		int pivot = v[right]; 
		int i = left - 1; 
		
		for (int j = left; j < right; j++){ 
			if(v[j] <= pivot){ 
				i++; 
				swap(v,i,j); 
		}
	} 
	swap(v,i+1,right);
	return i+1;		 		
}

	public static void swap(int[] v, int i, int j){ 

		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
 
	}
}
