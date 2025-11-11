import java.util.Arrays; 
import java.util.Scanner; 
public class Solucao{ 
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" ");
		int[] nums = new int[linha.length];

		for (int i = 0; i < linha.length;i++){
			
			nums[i] = Integer.parseInt(linha[i]);

}
			tabelaFrequencia(nums);

}
	public static void tabelaFrequencia(int[] v){ 
		int[] helper = new int[maiorValor(v) + 1];	
		String resultado = "";
		
		for (int num : v){
			helper[num] = helper[num] + 1; 
			}
		
		for (int i = 0; i<v.length;i++){
			if (helper[v[i]] != 0){
				resultado = resultado + v[i] + "," + helper[v[i]] + " ";
				helper[v[i]] = 0; 
			}
		}
		System.out.println(resultado.trim());
}

	public static int maiorValor(int[] v){
			
		int maiorValor = v[0];
		for (int i = 0; i < v.length; i++){ 
			if (v[i] > maiorValor){
			maiorValor = v[i];
		}
}	
		return maiorValor;
	}
}
