import java.util.Arrays;

public class Solucao{
	
	public static void main(String[] args){ 
		
	int[] v = {5,4,2,3,5,10,45,23,41,12};
	selectionSort(v);
	System.out.println(Arrays.toString(v));

}	

	public static void selectionSort(int[] v){
		for(int i = 0; i<v.length-1;i++){
			int menoridx = i; 
			for(int j = i + 1; j<v.length;j++){
				if(v[menoridx] > v[j]){
					menoridx = j; 
	}
}
		swap(v,menoridx,i);
	
	}
}
	public static void swap(int[] v, int i, int j){ 

		int aux = v[i]; 
		v[i] = v[j];
		v[j] = aux;

	}
}
