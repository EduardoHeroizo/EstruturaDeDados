public class Solucao{
	
	public static void main(String[] args){

	int[] nums = {1, 9, 15, -1, -44,22}; 
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
