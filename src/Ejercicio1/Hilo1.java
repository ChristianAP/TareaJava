package Ejercicio1;

public class Hilo1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+i);

			try {
				Hilo1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		for (int j = 10; j >= 0; j--) {
			System.out.print(" " +j);

			try {
				Hilo1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	
}
