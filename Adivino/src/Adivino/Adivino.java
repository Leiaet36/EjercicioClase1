package Adivino;

import java.util.Scanner;

public class Adivino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int) (Math.random() * 50) + 1;
		
	//	System.out.println("N�mero : " + aleatorio);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime un n�mero: ");
		int numero = teclado.nextInt();
		
		if (aleatorio == numero) {
			System.out.println("Has acertado, enhorabuena!!!");
		} else {
			if ( aleatorio < numero) {
				System.out.println("He pensado un n�mero menor.");
			} else {
				System.out.println("He pensado un n�mero mayor.");
			}
			System.out.print("Dime un n�mero: ");
			numero = teclado.nextInt();
			
			if (numero == aleatorio) {
				System.out.println("Has acertado, enhorabuena!!!");
			} else {
				if (aleatorio < numero) {
					System.out.println("He pensado un n�mero menor.");
				} else {
					System.out.println("He pensado un n�mero mayor.");
				}
				System.out.print("Dime un n�mero: ");
				numero = teclado.nextInt();	
				if (aleatorio == numero) {
					System.out.print("Has acertado en el �ltimo intento!!");
				} else {
					System.out.print("Mala suerte, era el " + aleatorio);
				}
			}
				
		}

	}

}
