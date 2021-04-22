package Ejercicio2;

import java.util.ArrayList;

public class Hilo1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nro = new ArrayList();
		ArrayList<Integer> res = new ArrayList();
		ArrayList<Integer> k = new ArrayList();
		 nro.add(2);
		 nro.add(7);
		 nro.add(5);
		 nro.add(4);
		 nro.add(9);
		 nro.add(3);
		 nro.add(6);
		 nro.add(8);
		 nro.add(1);
		 nro.add(10);
		 int potencia = 1;
		 int suma = 0;
		 int n = 0;
		 for (Integer i : nro) {
			n = i;
			k.add(n);
			System.out.print("[" + n + " al cubo es: ");
			try {
				Hilo1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	
	}
	
}
