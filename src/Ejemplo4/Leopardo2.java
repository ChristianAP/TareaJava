package Ejemplo4;

public class Leopardo2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("- Leopardo 2 -");
			try {
				Leopardo2.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	
}	
