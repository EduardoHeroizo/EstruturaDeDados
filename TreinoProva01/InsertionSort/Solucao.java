import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){ 

		int[] v = {1,5,4,12,34,1,2,56,12,34};
		insertionSort(v);
		System.out.println(Arrays.toString(v));
}

	public static void insertionSort(int[] v){ 

		for(int i = 1; i < v.length; i++){
			int index = i;
			while(index > 0 && v[index] < v[index-1]){
				swap(v,index,index-1);
				index--;
		}
	}
}

	public static void swap(int[] v, int i, int j){

		int aux = v[i]; 
		v[i] = v[j];
		v[j] = aux;
	}
}
