import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		boolean capi=true;
		for(int i=0; i<lista.size()/2; i++) {
			if(lista.get(i) != lista.get(lista.size()-1-i)) {
				capi=false;
			}
		}
		return capi;
	}
	
	public static List<Integer> formula (int n) {
		List<Integer> nums = new ArrayList<Integer>();
		formulaR(n, nums);
		return nums;
	}
	
	public static void formulaR(int n, List<Integer> list) {
		list.add(n);
		if(n != 1) {
			if(n % 2 == 0) {
				n = n/2;
				formulaR(n, list);
			}
			else {
				n = 3*n + 1;
				formulaR(n, list);
			}
		}
		else
			return;
	}
	
	public static void invertir(ArrayList<Integer> l) {
		invertirR(l, 0, l.size()-1);
	}
	
	public static void invertirR(ArrayList<Integer> l, int ini, int fin) {
		int aux1;
		int aux2;
		if(ini >= fin) {
			return;
		}
		aux1=l.get(ini);
		aux2=l.get(fin);
		l.set(ini, aux2);
		l.set(fin, aux1);
		invertirR(l, ini+1, fin-1);
	}
	
	public static int suma(LinkedList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		return sumaR(it);
	}
	
	public static int sumaR(Iterator<Integer> it) {
		if(it.hasNext()) {
			return it.next() + sumaR(it);
		}
		return 0;
	}
    
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
		ArrayList<Integer> resultado = new ArrayList<>();
        int indice1 = 0;
        int indice2 = 0;

        // Recorrer ambas listas y comparar los elementos en orden
        while (indice1 < lista1.size() && indice2 < lista2.size()) {
            int elemento1 = lista1.get(indice1);
            int elemento2 = lista2.get(indice2);

            if (elemento1 <= elemento2) {
                resultado.add(elemento1);
                indice1++;
            } else {
                resultado.add(elemento2);
                indice2++;
            }
        }

        // Agregar los elementos restantes de la lista1, si los hay
        while (indice1 < lista1.size()) {
            resultado.add(lista1.get(indice1));
            indice1++;
        }

        // Agregar los elementos restantes de la lista2, si los hay
        while (indice2 < lista2.size()) {
            resultado.add(lista2.get(indice2));
            indice2++;
        }

        return resultado;
    }
	
	public static void main(String args[]) {
		Estudiantes e1 = new Estudiantes();
		Estudiantes e2 = new Estudiantes();
		Estudiantes e3 = new Estudiantes();
		Estudiantes e4 = new Estudiantes();
		
		List estudiantes = new ArrayList();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(2);
		nums.add(1);
		
		System.out.println(TestArrayList.esCapicua(nums));
		
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		
		
		if(!estudiantes.contains(e4)) {
			estudiantes.add(e4);
		}
		
		List<Integer> secuencia = TestArrayList.formula(6);
		
		for(int s : secuencia) {
			System.out.print(s + " ");
		}
		
		ArrayList<Integer> lista = new ArrayList<>();
		
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        
        ArrayList<Integer> lista1 = new ArrayList<>();
		
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println();
        ArrayList<Integer> orden = TestArrayList.combinarOrdenado(lista1, lista);
        System.out.println("ordenado");
        for(int l : orden) {
			System.out.print(l + " ");
		}
        
        
        
        TestArrayList.invertir(lista);
        
        System.out.println();
        
        for(int l : lista) {
			System.out.print(l + " ");
		}
        
        System.out.println();
        
        LinkedList<Integer> lis = new LinkedList<Integer>();
        lis.add(0);
        lis.add(5);
        lis.add(4);
        
        System.out.println(TestArrayList.suma(lis));
		
	}
	
	
}
