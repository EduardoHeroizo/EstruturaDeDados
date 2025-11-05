public class Solution {

	public static int encontraPrimeiroNegativo(int[] v, int idx){
 		
		if (idx >= v.length) return -1; 
		if (v[idx] < 0) return v[idx]; 
		return encontraPrimeiroNegativo(v, idx+1);		
		
	}

	public static void main(String[] args){

	int[] arr = {1,2,3,4,5,3,-4,3};

	int resultado = encontraPrimeiroNegativo(arr,0);
	System.out.println(resultado);
	
	}

	public static void testar(){

		return; 


	}
}
