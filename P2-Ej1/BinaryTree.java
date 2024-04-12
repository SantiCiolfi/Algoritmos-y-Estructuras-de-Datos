import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
        int sum = 0;
        if (this.isLeaf()) {
            return 1;
        }
        if(this.hasLeftChild()) sum += this.getLeftChild().contarHojas();
        if(this.hasRightChild()) sum += this.getRightChild().contarHojas();
        
        return sum;
	}
    	 
    public BinaryTree<T> espejo(){
    	return this.espejoRecursivo(this);
    }
    
    private BinaryTree<T> espejoRecursivo(BinaryTree<T> arbol){
    	if(arbol == null) {
    		return null;
    	}
    	
    	BinaryTree<T> nuevoArbol = new BinaryTree<>(arbol.getData());
    	
    	if(this.hasRightChild()) nuevoArbol.addLeftChild(espejoRecursivo(arbol.getRightChild()));
    	if(this.hasLeftChild()) nuevoArbol.addRightChild(espejoRecursivo(arbol.getLeftChild()));
        
        return nuevoArbol;
    }
    
	// 0<=n<=m
    public void entreNiveles(int n, int m){
		this.entreNivelesRecursivo(this,n,m);
    }
	
    private void entreNivelesRecursivo(BinaryTree<T> arbol, int n, int m) {
    	// Obtener la altura del árbol
    	int altura = calcularAltura(arbol);
    	
    	// Verificar si los niveles dados son válidos
    	if (n < 0 || m > altura || n > m) {
            System.out.println("Niveles dados no validos");
            return;
        }
    	
    	Queue<BinaryTree<T>> cola = new LinkedList<>();
        cola.offer(arbol);
        
        int nivelActual = 0;

        while (!cola.isEmpty()) {
            int numNodosNivelActual = cola.size();
            nivelActual++;

            if (nivelActual >= n && nivelActual <= m) {
                // Si estamos dentro del rango de niveles, imprimir el nivel actual
                System.out.println("Nivel " + nivelActual + ":");
                for (int i = 0; i < numNodosNivelActual; i++) {
                    BinaryTree<T> nodo = cola.poll();
                    System.out.print(nodo.getData() + " ");

                    // Agregar los hijos del nodo actual a la cola para procesar en el siguiente nivel
                    if (nodo.hasLeftChild()) {
                        cola.offer(nodo.getLeftChild());
                    }
                    if (nodo.hasRightChild()) {
                        cola.offer(nodo.getRightChild());
                    }
                }
                System.out.println();// Imprimir nueva línea después de cada nivel
            } else {
            	 // Si no estamos dentro del rango de niveles, simplemente agregamos los hijos del nodo actual a la cola
                for (int i = 0; i < numNodosNivelActual; i++) {
                    BinaryTree<T> nodo = cola.poll();
                    if (nodo.hasLeftChild()) {
                        cola.offer(nodo.getLeftChild());
                    }
                    if (nodo.hasRightChild()) {
                        cola.offer(nodo.getRightChild());
                    }
                }
            }
        }
    }
    
    public int calcularAltura(BinaryTree<T> arbol) {
        if (arbol == null) {
            return 0;
        }

        int alturaIzquierda = 1 + calcularAltura(arbol.getLeftChild());
        int alturaDerecha = 1 + calcularAltura(arbol.getRightChild());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }	
}

