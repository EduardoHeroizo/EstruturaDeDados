import java.util.Arrays;

public class Solucao{
	
	public static void main(String[] args){ 

		int[] v = {2,6,4,10,3,54,32,103,40,65,423,1,1,0,54};
		insertionSort(v);
		System.out.println(Arrays.toString(v));

}

	public static void insertionSort(int[] v){

		for (int i = 1; i < v.length; i++){ 
			int temp = i; 
			while (temp > 0 && v[temp] < v[temp - 1]){
				swap(v,temp,temp-1);
				temp--;
			}	
		}
	}

	public static void swap(int[] v, int i, int j){
		
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp; 

	}	
}
