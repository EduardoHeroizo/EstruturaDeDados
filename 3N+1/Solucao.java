import java.util.Scanner; 

public class Solucao{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt(); 
		tresN(numero);

	}

	public static void tresN(int n){

		while (n!=1){
		
		System.out.println(n);
		
		if (n % 2 == 0){
		n = n / 2; 
		
		} else { 
		n = (3 * n) + 1; 
		
			}
		
		}
	System.out.println(1);
	}
}
