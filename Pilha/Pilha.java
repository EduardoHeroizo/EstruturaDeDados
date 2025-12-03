import java.util.Arrays;
public class Pilha{

	private int topo; 
	private Integer[] pilha; 
	
	public Pilha(int capacidade){ 

		this.pilha = new Integer[capacidade];
		this.topo = -1; 
	}

	public boolean isEmpty(){ 
		return this.topo == -1; 
	}
	
	public boolean isFull(){
		return this.topo + 1 == this.pilha.length; 

	}

	public void push(int v){ 
		if(isFull()) throw new RuntimeException("Pilha cheia"); 
		this.pilha[++this.topo] = v;
	}

	public int pop(){
		if(isEmpty()) throw new RuntimeException(); 
		return this.pilha[this.topo--];
		}

	public static void main(String[] args){
		
		Pilha p = new Pilha(5); 
		p.push(4);
		p.push(3); 
		System.out.println(p.pop());
		System.out.println(p.pop());	
	}
}
