import java.util.Scanner; 
import java.util.Arrays; 

public class Solucao{ 

	public static void main(String[] args){

	int[] v = {5, 1, 7, 3, 9, 10, 2, 4, 3};
	int num1 = 0; 
	int num2 = 3; 
	quickSort(v,0,v.length-1);
	System.out.println(Arrays.toString(v));
	melhorPivot(v,num1,num2);
}
	public static void melhorPivot(int[] v, int num1, int num2){
	
		int melhorPivot = (0 + v.length - 1) / 2;
		int dist1 = Math.abs(melhorPivot - v[num1]);
    		int dist2 = Math.abs(melhorPivot - v[num2]);

    		if (dist1 <= dist2) {
        		System.out.println(num1);
    		} else {
        		System.out.println(num2);
    }

}

	public static void quickSort(int[] v, int left, int right){
	
		if (left >= right) return; 
		
		int indicePivot = partition(v, left, right); 
		quickSort(v, indicePivot + 1, right); 
		quickSort(v, left, indicePivot - 1);

	}

	public static int partition(int[] v, int left, int right){ 

		int pivot = v[left]; 
		int i = left; 
		for (int j = i + 1; j <= right; j++){

			if(v[j] <= v[left]){
				i++;
				swap(v,i,j);
		}
	}
		swap(v,i,left); 
		return i; 
}
