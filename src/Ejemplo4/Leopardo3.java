package Ejemplo4;

public class Leopardo3 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("- Leopardo 3 -");
			try {
				Leopardo3.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	
}
