import java.util.Arrays; 

public class Solucao{

	private Integer[] lista; 
	private static final int CapacidadeMaxima = 20; 
	private int tamanho; 

	public Solucao(){
		this(CapacidadeMaxima); 
	}
	public Solucao(int capacidade){
		this.lista = new Integer[capacidade];
		this.tamanho = 0; 
	}

	public boolean add(int v){ 
		asseguraCapacidade(this.tamanho+1); 
		this.lista[tamanho++] = v; 
		return true;
	
	}

	private asseguraCapacidade(int capacidadePretendida){	
		if (capacidadePretendida > this.lista.length){ 
			resize(Math.max(lista.length * 2, capacidadePretendida);
		}
	}
	
	public boolean add(int index, int v){ 



}

	
}
