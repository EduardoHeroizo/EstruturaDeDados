import java.util.Arrays;

public class Solucao01{
	

	public static void main(String[] args){

	int[] v = {1, 2, 4, 3, 70, 90};
	moveImpostor(v);
	System.out.println(Arrays.toString(v));
}
	public static void moveImpostor(int[] v){

		int index = -1; 
		for(int i = 1; i < v.length; i++){

			if(v[i] < v[i-1]){
				index = i;
	}
}
		while (index > 0 && v[index] < v[index-1]){
			swap(v,index,index-1);
			index--;
	}
}	

	public static void swap(int[] v, int i, int j){

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;

	}
}
