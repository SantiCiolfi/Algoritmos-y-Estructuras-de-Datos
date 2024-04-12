
public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma(){
		this.recorrerArbol(this.arbol);
		return arbol;
	}
	
	public int recorrerArbol(BinaryTree<Integer> nodo) {
		//si es una hoja se setea en 0 y envia su contenido anterior con el return
		if (nodo.isLeaf()) {
			int aux = nodo.getData();
			nodo.setData(0);
			return aux;
		}
		int sumLeft = 0; int sumRight = 0;
		if (nodo.hasLeftChild()) sumLeft = this.recorrerArbol(nodo.getLeftChild());
		if (nodo.hasRightChild()) sumRight = this.recorrerArbol(nodo.getRightChild());
		
		//tomo el valor del nodo actual
		int aux = nodo.getData();
		//el nodo actual pasa a tener el valor de la suma de sus sub-arboles
		nodo.setData(sumLeft + sumRight);
		//envia con el return el resultado de la suma de sus subarboles y su dato anterior
		return aux + sumLeft + sumRight;
		
	}
	public void imprimirArbol(BinaryTree<Integer> arbol) {
		System.out.println(arbol.getData());
		if (arbol.hasLeftChild()) {
			this.imprimirArbol(arbol.getLeftChild());
		}
		if (arbol.hasRightChild()) {
			this.imprimirArbol(arbol.getRightChild());
		}
	}
}
