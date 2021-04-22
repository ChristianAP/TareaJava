package Ejemplo4;

public class Leopardo4 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("- Leopardo 4 -");
			try {
				Leopardo4.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.print("Gano¡¡¡¡");
	}
	
}
