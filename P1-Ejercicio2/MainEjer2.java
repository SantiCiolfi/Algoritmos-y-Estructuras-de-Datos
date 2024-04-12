import java.util.Scanner;

public class MainEjer2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in) ;
		int num = s.nextInt();
		int[] multiplos;
		
		while (num != -1) {
			multiplos = Multiplos.multiplosDeN(num);
			for(int i=0; i<num; i++) {
				System.out.print(multiplos[i] + " | ");
			}
			System.out.println();
			num = s.nextInt();
		}
	}
}
