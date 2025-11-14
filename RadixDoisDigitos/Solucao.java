public class Solucao{
	
	public static void countingSort(int[] v, int exp){

		int[] count = new int[10];
		int[] output = new int[v.length]; 
		
		for(int i = 0; i<v.length;i++){
			int digit = (v[i] / exp) % 10; 
			count[digit]++; 
		}
		for(int i = 1; i<count.length;i++){

			count[i]+= count[i-1];
		}
		for(int i = v.length-1; i>= 0; i--){

			int digit = (v[i] / exp) % 10; 
			output[count[digit]-1] = v[i];
			count[digit]--;
		}		
		for(int i = 0; i<v.length;i++){
			v[i] = output[i];
		}	
	}

	public static void radixSort(int[] v, int digitomax){ 
	
		for(int exp = 10; (v.getMax / exp) > 0 && exp <= 10 ** digitomax; exp*= 100){
			countingSort(v,exp); 
		}
	}

	public static int getMax(int[] v){
		int max = v[0]; 
		for (int i =0; i<v.length;i++){
			if(max < v[i]){
				max = v[i];
			}
		}
		return max; 	
	}
}
