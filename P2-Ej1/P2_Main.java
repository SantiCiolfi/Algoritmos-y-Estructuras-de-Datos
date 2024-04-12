import java.util.ArrayList;
import java.util.List;

public class P2_Main {
	 public static void main(String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<>(1);

	    arbol.addLeftChild(new BinaryTree<>(2));
	    arbol.addRightChild(new BinaryTree<>(3));
	    arbol.getLeftChild().addLeftChild(new BinaryTree<>(4));
	    arbol.getLeftChild().addRightChild(new BinaryTree<>(5));
	    arbol.getRightChild().addLeftChild(new BinaryTree<>(6));
	    arbol.getRightChild().addRightChild(new BinaryTree<>(7));
	    
	    ContadorArbol ca = new ContadorArbol(arbol);
	    
	    int altura = arbol.calcularAltura(arbol);
	    // Imprimir el árbol original
	    System.out.println("arbol original");
	    arbol.entreNiveles(1, altura);
	
	    List<Integer> lista = ca.numerosPares();
	    
	    System.out.println();
	    
	    P2_Main.imprimirLista(lista);
	    
 	}
	
	// Método auxiliar para imprimir el árbol en preorden
	private static void imprimirArbol(BinaryTree<Integer> arbol) {
		if (arbol != null) {
			System.out.println(arbol.getData());
			imprimirArbol(arbol.getLeftChild());
			imprimirArbol(arbol.getRightChild());
		}
	}
	
	private static void imprimirLista(List<Integer> lista) {
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
