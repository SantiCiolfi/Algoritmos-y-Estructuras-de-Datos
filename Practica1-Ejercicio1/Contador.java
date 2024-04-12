public class Contador {
	
	public static void contar1(int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void contar2(int a, int b) {
		int i=a;
		while(i<=b){
			System.out.println(i);
			i++;
		}
	}
	
	public static void contar3(int a, int b) {
		if (a > b) {
			return;
		}
		System.out.println(a);
		
		contar3(a+1, b);
	}
}
