import java.util.Arrays;

public class Solucao{ 

	public static void main(String[] args){ 

	int[] nums = {1,2,3,6,8,5,3,10,12,1};
	countingSort(nums);
}

	public static void countingSort(int[] v){

		int[] helper = new int[maiorValor(v) + 1];	
		for (int i = 0; i<v.length; i++){
			helper[v[i]]++;
		}
		
		int index = 0;
		for (int i = 0; i < helper.length; i++){
			while (helper[i] > 0){
				v[index++] = i; 
				helper[i]--; 
		}
	}
		System.out.println(Arrays.toString(v));		
}

	public static int maiorValor(int[] v){ 

		int max = v[0]; 
		for (int i = 1; i < v.length; i++){
			if (v[i] > max){
				max = v[i];
			}
		}
		return max;
	}
}

