public class Solucao{
	
	public static void main(String[] args){

	int[] nums = {6, 2, 1, 9, 3}; 
	Ordem(nums); 

}

	public static void Ordem(int[] v){ 
		
		int count = 0; 
		for (int j = 0; j < v.length;j++){
			if (v[j] <= v[0]){
			count++; 
			} 
		}	
	System.out.println(count);	 
	}
}
