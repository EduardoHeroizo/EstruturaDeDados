import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){ 

		int[] v = {5,4,1,2,0,0,1};
		countingSort(v);
		System.out.println(Arrays.toString(v));
}

	public static void countingSort(int[] v){
		
		int[] output = new int[v.length]; 
		int[] count = new int[getMax(v) + 1]; 
		
		for(int i = 0; i<v.length;i++){ 
			count[v[i]]++;
		}
		
		for(int i = 1; i < count.length; i++){
			count[i] = count[i] + count[i-1];
}
		for(int i = v.length-1; i >= 0; i--){

			output[count[v[i]]-1] = v[i];
			count[v[i]]--;
		}
		
		for(int i = 0; i<v.length; i++){
			v[i] = output[i];
	} 
}

	public static int getMax(int[] v){ 

		int max = -1; 
		for (int i = 0; i<v.length;i++){ 
		if(v[i] > max) max = v[i];

		}
		return max;
	}
}
