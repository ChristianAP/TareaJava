package Ejemplo4;

public class Leopardo1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("- Leopardo 1 -");
			try {
				Leopardo1.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	
}
