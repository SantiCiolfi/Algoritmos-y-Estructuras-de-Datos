
public class Ejer5 {
	
	public static int[] test1(int[] v) {
		int[] results = {999, -999, 0};
		int aux = 0;
		
		for(int i = 0; i<v.length; i++) {
			if(v[i]>results[1]) {
				results[1]=v[i];
			}
			if(v[i]<results[0]) {
				results[0]=v[i];
			}
			aux = aux + v[i];
		}
		results[2]=aux/v.length;
		System.out.println(results[0]);
		System.out.println(results[1]);
		System.out.println(results[2]);
		return results;
	}
	
	public static Resultados test2(int[] v) {
		Resultados resul = new Resultados();
		if(v.length == 0) {
			return resul;
		}
		
		for(int i = 0; i<v.length; i++) {
			if(v[i]>resul.max) {
				resul.max=v[i];
			}
			if(v[i]<resul.min) {
				resul.min=v[i];
			}
			resul.prom = resul.prom + v[i];
		}
		resul.prom=resul.prom/v.length;
		return resul;
	}
	
	public static void test3(int[] v) {
		int max=-999;
		int min=999;
		double prom=0;
		for(int i = 0; i<v.length; i++) {
			if(v[i]>max) {
				max=v[i];
			}
			if(v[i]<min) {
				min=v[i];
			}
			prom = prom + v[i];
		}
		prom=prom/v.length;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(prom);
	}
	
	public static void main(String args[]) {
		int[] intArray = {1,2,3,4,5};
		int[] resul = new int[3];
		resul=Ejer5.test1(intArray);
		System.out.println("resultados test1");
		for(int i = 0; i<resul.length; i++) {
			System.out.println(resul[i]); //MIN MAX PROM
		}
		System.out.println("resultados test2");
		Resultados resultados = Ejer5.test2(intArray);
		System.out.println(resultados.min);
		System.out.println(resultados.max);
		System.out.println(resultados.prom);
		System.out.println("resultados test3");
		Ejer5.test3(intArray);
	}
	
	static class Resultados{
		int max = -999;
		int min = 999;
		double prom = 0;
	}
	
}
