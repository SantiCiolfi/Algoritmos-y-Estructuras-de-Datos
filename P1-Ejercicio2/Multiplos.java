
public class Multiplos {
	
	public static int[] multiplosDeN (int num){
		int[] m = new int[num];
		
		
		for (int i=0; i<num; i++) {
			m[i]=num * (i+1);
		}
		return m;
	}
}
