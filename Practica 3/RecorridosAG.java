import java.util.ArrayList;
import java.util.List;

public class RecorridosAG {
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lista = new ArrayList<Integer>();
		if (a == null) return lista;
		
		if(a.getData() > n) {
			lista.add(a.getData());
		}
		if(a.hasChildren()) {
			for (GeneralTree<Integer> e: a.getChildren()) {
				lista.addAll(numerosImparesMayoresQuePreOrden(e, n));
			}
		}
		return lista;
	}
}
