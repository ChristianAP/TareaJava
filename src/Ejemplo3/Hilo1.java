package Ejemplo3;

import java.util.Scanner;

public class Hilo1 extends Thread{
	
	@Override
	public void run() {
	Scanner teclado = new Scanner(System.in);
	int i;
	System.out.print("Ingrese el nro. que desea sacar su factorial: ");
	i= teclado.nextInt();
	int factorial = 1;
	for (int j = i; j > 0; j--) {
		factorial = factorial * j;
		System.out.print(j + " x ");
		try {
			Hilo1.sleep(400);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	System.out.println("= \nEl factorial de " + i+" es: "+factorial);
	}
		
	
	
}
