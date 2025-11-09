import java.util.Arrays;
import java.util.Scanner; 

public class Solucao {

	public static void main(String[] args){

		int[] nums1 = {1,2,3,4,5};
		int[] nums2 = {1,2,3,4,5,6,7};
		merge(nums1,nums2);
	}

	public static void merge(int[] nums1, int[] nums2){

		int i = 0;
		int j = 0;
		int idx = 0; 
		int[] numeros = new int[(nums1.length + nums2.length)];
			
			while (i < nums1.length && j < nums2.length){
				
				if (nums1[i] <= nums2[j]){
					numeros[idx] = nums1[i];
					i++;
					idx++; 
				} else {
					numeros[idx] = nums2[j];
					j++;
					idx++;
		}			 
	}
	
	while (i < nums1.length){

		numeros[idx] = nums1[i]; 
		i++;
		idx++;
	}
	
	while (j < nums2.length){
		
		numeros[idx] = nums2[j];
		j++;
		idx++;
	}
		System.out.println(Arrays.toString(numeros));
	}
}
