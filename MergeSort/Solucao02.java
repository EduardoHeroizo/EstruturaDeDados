import java.util.Arrays;

public class Solucao02{

	public static void main(String[] args){

	int[] v = {1,2,5,2,3,50,34,21,20,0,5,1,1,3,40};
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


	public static void merge(int[] v, int left, int meio, int right){

		int[] helper = new int[v.length];
		for (int i = 0; i < v.length; i++){
			helper[i] = v[i];
}

	int i = left; 
	int k = left; 
	int j = meio + 1;

		while(i <= meio && j <= right){
			if(helper[i] <= helper[j]){
				v[k] = helper[i];
				k++;
				i++;
			} else {
			v[k] = helper[j];	
			j++;
			k++;
	}
}
	
	while(i <= meio){
		v[k] = helper[i]; 
		i++;
		k++;
			}
	
	while(j <= right){
		v[k] = helper[j];
		j++;
		k++;
			}	
		}	 
}
