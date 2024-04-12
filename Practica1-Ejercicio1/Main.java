import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese el numero a: ");
		int a = input.nextInt();
		System.out.println("ingrese el numero b: ");
		int b = input.nextInt();
		Contador.contar1(a,b);
		Contador.contar2(a,b);
		Contador.contar3(a,b);
	}
}
