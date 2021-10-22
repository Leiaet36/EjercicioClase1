package Adivino;

import java.util.Scanner;

public class Adivino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int) (Math.random() * 50) + 1;
		
	//	System.out.println("Número : " + aleatorio);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		int numero = teclado.nextInt();
		
		if (aleatorio == numero) {
			System.out.println("Has acertado, enhorabuena!!!");
		} else {
			if ( aleatorio < numero) {
				System.out.println("He pensado un número menor.");
			} else {
				System.out.println("He pensado un número mayor.");
			}
			System.out.print("Dime un número: ");
			numero = teclado.nextInt();
			
			if (numero == aleatorio) {
				System.out.println("Has acertado, enhorabuena!!!");
			} else {
				if (aleatorio < numero) {
					System.out.println("He pensado un número menor.");
				} else {
					System.out.println("He pensado un número mayor.");
				}
				System.out.print("Dime un número: ");
				numero = teclado.nextInt();	
				if (aleatorio == numero) {
					System.out.print("Has acertado en el último intento!!");
				} else {
					System.out.print("Mala suerte, era el " + aleatorio);
				}
			}
				
		}

	}

}
