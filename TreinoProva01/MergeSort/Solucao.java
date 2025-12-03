public class Solucao{ 

	public static void main(String[] args){ 



}

	public static void mergeSort(int[] v, int left, int right){

		if(left >= right) return; 
		int meio = (left + right) / 2;
		mergeSort(v, left, meio); 
		mergeSort(v, meio+1, right);		
		merge(v, left, meio, right);

	}

	public static void merge(int[] v, int left, int mid, int right){

		int[] helper = new int[v.length];

	}
}
