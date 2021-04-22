package Ejercicio2;

import java.util.ArrayList;

public class Hilo2 extends Thread{

	@Override
	public void run() {
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
			potencia = i * i * i ;
			res.add(potencia);
			System.out.println(potencia + "] - ");
			try {
				Hilo2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		for (Integer j : res) {
			suma = suma + j;
			
		}
		System.out.println("\nLa suma de los cubos de los números es: " + suma);
	}
	
	
}
