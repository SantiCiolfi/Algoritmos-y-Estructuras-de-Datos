
public class Test {
	
	public static void main(String args[]) {
		Estudiante[] e = new Estudiante[2];
		Profesor[] p = new Profesor[3];
		
		e[0] = new Estudiante("pedro", "martinez","1","pedro@gmail.com", "avenida siempreviva");
		e[1] = new Estudiante("miguel", "perez","2","miguel@gmail.com", "avenida siempreviva");
		
		p[0] = new Profesor("juan", "ramirez","informatica", "juan@gmail.com", "111");
		p[1] = new Profesor("pablo", "martin","ingenieria", "pablo@gmail.com", "222");
		p[2] = new Profesor("ramon", "oscar","medicina", "ramon@gmail.com", "222");
		
		System.out.println(e[0].tusDatos());
		System.out.println(e[1].tusDatos());
		System.out.println(p[0].tusDatos());
		System.out.println(p[1].tusDatos());
		System.out.println(p[2].tusDatos());
	}
	
}
