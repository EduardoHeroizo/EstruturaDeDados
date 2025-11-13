import java.util.Arrays;

public class Solucao02{
	

	public static void main(String[] args){

		int[] v = {1,2,5,2,30,51,23,45,41,0,23};
		selectionSort(v);
		System.out.println(Arrays.toString(v));
}

	public static void selectionSort(int[] v){

		for (int i = 0; i < v.length - 1; i++){ 
			int menoridx = i; 
			for (int j = i + 1; j < v.length; j++){
				if (v[j] < v[menoridx]){
					menoridx = j; 
					}
				}
			swap(v,i,menoridx);
			}		 
		}
	

	public static void swap(int[] v, int i, int j){

		int temp = v[i]; 
		v[i] = v[j]; 
		v[j] = temp; 

	}
}
