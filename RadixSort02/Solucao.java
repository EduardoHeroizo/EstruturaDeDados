import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){

	int[] v = {1,2,3,4,0,234,13,3245,32,12,1,234};
	radixSort(v);
	System.out.println(Arrays.toString(v));	

}

	public static void countingSort(int[] v, int exp){

		int [] output = new int[v.length];
		int [] digits = new int[10];

		for (int i = 0; i < v.length; i++){
			int digit = (v[i] / exp) % 10;
			digits[digit]++;
			}
		for (int i = 1; i < 10; i++){			
			digits[i] += digits[i-1];
		}
		for (int i = v.length - 1 ; i >= 0;i--){
			int digit = (v[i] / exp) % 10;
			output[digits[digit]-1] = v[i];
			digits[digit]--;
		}
		for (int i = 0; i < v.length; i++){
		
			v[i] = output[i];
		}			
	}

	public static void radixSort(int[] v){
		int max = getMax(v);  
		for (int exp = 1; max / exp > 0; exp *= 10){
			countingSort(v,exp);	
		}
	}

	public static int getMax(int[] A) {
        	int max = A[0];
        	for (int x : A) {
            	if (x > max) max = x;
        	}
        	return max;
    	}
}
