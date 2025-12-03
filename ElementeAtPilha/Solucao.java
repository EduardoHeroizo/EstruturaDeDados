import java.util.Scanner; 
import java.util.Arrays;

public class Solucao{ 

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in); 
	String[] linha = sc.nextLine().split(" "); 
	int v = sc.nextInt(); 
	int[] lista = new int[linha.length]; 
	
	for (int i = 0; i < linha.length;i++){
		lista[i] = Integer.parseInt(linha[i]);
	}
	Pilha p = new Pilha(linha.length); 
	for (int i = 0; i < lista.length; i++){ 
		p.push(lista[i]); 
		}
		if (p.get(v) != -1){ 
		System.out.println(p.get(v)); 
	 }else {
	System.out.println("indice invalido");
	testarPilha(); 
	}

	public static class Pilha{ 
		private int[] pilha; 
		private int topo;
	
	public Pilha(int capacidade){  
		this.pilha = new int[capacidade];
		this.topo = -1;
		}

	public void push(int v){ 
		this.pilha[++this.topo] = v; 
			} 
	
	public int pop(){ 
		return this.pilha[this.topo--]; 
}
	public int get(int idx){ 
		int i = 0; 
		while(!this.isEmpty()){
			int v = this.pop();
			if (idx == i) return v; 
 			i++; 
	}
	return -1;
}
	public boolean isEmpty(){ 
		return this.topo == -1; 		
		}	
	}

	public static void testarPilha(){

		Pilha p = new Pilha(5);
         	p.push(1);
		p.push(4);
		p.push(34);
		p.push(2); 
		assert p.get(0) == 2;
		assert p.get(12) == -1; 
	}
}
