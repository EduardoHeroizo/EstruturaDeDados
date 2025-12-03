public class Fila{

	private Integer[] fila;
	private int head; 
	private int tail; 
	private int size; 

	public Fila(int capacidade){
		
		this.fila = new Integer[capacidade];
		this.head = -1;
		this.tail = -1; 
		this.size = 0; 
	}
	
	public boolean isFull(){
		return this.size >= this.fila.length; 
	}

	public boolean isEmpty(){
		return this.size == 0; 
	}

	public void addLast(int v){ 
		if (!isFull()) this.size++;
		if (isEmpty()) this.head = 0;  
		if(isFull()) this.head = (this.head + 1) % this.fila.length; 
		
		this.tail = (this.tail + 1) % this.fila.length; 
		this.fila[this.tail] = v; 
	}

	public int removeLast(){ 
		if (isEmpty()) throw new RuntimeException(); 
		
		int v = this.fila[this.head]; 
		if (this.tail == this.head){ 
			this.head = -1; 
			this.tail = -1;
	}
		this.head = (this.head + 1) % this.fila.length; 
		this.size--;
		return v;  	
	}

	public static void main(String[] args){
		Fila f = new Fila(3); 
		f.addLast(5); 
		f.addLast(3); 
		f.addLast(6);
		f.addLast(4); 
		assert f.removeLast() == 3: "Fila Circular não está funcionando"; 
	}
}
