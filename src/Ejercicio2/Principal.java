package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo1 n1 = new Hilo1();
		Hilo2 n2 = new Hilo2();
		
		n1.start();
		try {
			n1.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		n2.start();
		try {
			n2.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
