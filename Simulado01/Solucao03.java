import java.util.Arrays;

public class Solucao03{


	public static void main(String[] args){ 

	int[] v = {1,2,4,10,5,34,56,0,12};
	mergeSort(v,0,v.length-1);
	System.out.println(Arrays.toString(v));

}

	public static void mergeSort(int[] v, int left, int right){ 

		if (left >= right) return; 
		int meio = (left + right) / 2; 
		
		mergeSort(v,left,meio);
		mergeSort(v,meio+1,right);
		merge(v,left,meio,right);
}


	public static void merge(int[] v, int left, int mid, int right){ 

		int[] helper = new int[v.length];
		for (int i = 0; i<v.length;i++){ 
			helper[i] = v[i]; 
		}

		int i = left; 
		int k = left; 
		int j = mid + 1; 
		
		while (i <= mid && j <= right){ 

			if (helper[i] <= helper[j]){
				v[k] = helper[i];
				k++;
				i++;	
			} else { 
			v[k] = helper[j]; 
			k++;
			j++;
	}
}
	while(i <= mid){ 
		v[k] = helper[i]; 
		k++;
		i++;
			}
	while(j <= right){
		v[k] = helper[j];
		k++; 
		j++; 
			
		}	
	}
}
