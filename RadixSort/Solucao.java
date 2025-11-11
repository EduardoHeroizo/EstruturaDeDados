import java.util.Arrays;

public class Solucao{

	public static void main(String[] args){

	int[] nums = {2,3,5,2,3,213,3,23,41,123,51};
	radixSort(nums);

	}

	public static void countingSort(int[] a, int exp){

	int n = a.length; 
	int[] b = new int[n];
	int[] c = new int[10]; 

	for (int i = 0; i < n; i++){

		int digit = (a[i] / exp) % 10;
		c[digit]++;
		}

	for (int i = 1; i < 10; i++) {

		c[i] += c[i-1];
		}

	for (int i = n - 1; i >= 0; i--) {
        int digit = (a[i] / exp) % 10;
        b[c[digit] - 1] = a[i];
        c[digit]--;
    }

  for (int i = 0; i < n; i++) {
        a[i] = b[i];

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
