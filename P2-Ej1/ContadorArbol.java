import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
	
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol=arbol;
	}
	
	public BinaryTree<Integer> getArbol(){
		return this.arbol;
	}
	
	public List<Integer> numerosPares() {
		List<Integer> pares = new ArrayList<>();
		numerosParesRecursivo(arbol, pares);
        return pares;
	}
	
	private void numerosParesRecursivo(BinaryTree<Integer> nodo, List<Integer> pares){
		if (nodo == null) {
            return;
        }

        if (nodo.getData() % 2 == 0) {
            pares.add(nodo.getData());
        }

        numerosParesRecursivo(nodo.getLeftChild(), pares);
        numerosParesRecursivo(nodo.getRightChild(), pares);
    }	
}
