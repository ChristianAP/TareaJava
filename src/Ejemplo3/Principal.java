package Ejemplo3;

public class Principal {
	public static void main(String[]args) {
		Hilo1 h1 = new Hilo1();
		h1.start();
		try {
			h1.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
