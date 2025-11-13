public class Solucao02{

	public static void main(String[] args){

	int[] v = {2,3,45,5,21,1,2};
	contemDuplicado(v);

}
	
	public static boolean contemDuplicado(int[] v){ 
		
		boolean resposta = false; 
		int max = getMax(v);
		int[] count = new int[getMax(v)+1];
		for (int i = 0; i < v.length; i++){
			count[v[i]]++;
	}

		for (int i = 0; i<count.length;i++){
		if (count[i] > 1){
			resposta = true; 
		}
	}
	if (resposta){
	System.out.println("Tem duplicado");
	}
	return resposta;
}		
	public static int getMax(int[] v){
		
		int max = v[0]; 
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max){
				max = v[i];
			}			
		}
		return max; 
	}
}
