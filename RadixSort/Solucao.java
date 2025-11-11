import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){

	int[] nums = {2,3,5,2,3,213,3,23,41,123,51};
	radixSort(nums);

	}

	public static void countingSort(int[] v, int exp){
	
	int[] output = new int[v.length];
	int[] count = new int[10];
		
	for (int i = 0; i < v.length;i++){
		int digit = (v[i] / exp) % 10; 
		count[digit]++;
		}

	for (int i = 1; i<10;i++){

		count[i] += count[i-1];
		}

	for (int i = v.length - 1; i >= 0; i--){

		int digit = (v[i] / exp) % 10;
		output[count[digit]-1] = v[i];
		count[digit]--;
 
		}
	for (int i = 0; i < v.length; i++){

		v[i] = output[i];

		}		
	}

	public static int maximoValor(int[] v){ 
		int maiorValor = v[0];
		for (int i = 0; i < v.length;i++){
			if(v[i] > maiorValor){
				maiorValor = v[i];
			}
		}
		return maiorValor;		
	}

	public static void radixSort(int[] v){

		int max = maximoValor(v); 
		for (int exp = 1; max / exp > 0; exp *= 10){
			countingSort(v,exp);
		}
	System.out.println(Arrays.toString(v));
	}
}
