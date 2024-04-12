
public class ProfundidadDeArbolBinario {
    private BinaryTree<Integer> arbol;

    public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public int sumaElementosProfundidad(int p) {
        int i = 0;
        return this.recursion (arbol,p,i);
    }

    private int recursion (BinaryTree<Integer> nodo, int p, int i) {
        if (nodo == null) {
;            return 0;
        }
        int sum = 0;
        if (i == p) {
            return nodo.getData();
        }
         sum += recursion(nodo.getLeftChild(), p, i + 1);
         sum += recursion(nodo.getRightChild(), p, i + 1);

        return sum;
    }
}
