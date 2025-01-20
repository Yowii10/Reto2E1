package Ejercicio;

import java.util.Scanner;

import Util.Funciones;

public class reto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("1. Ver tiendas");
			System.out.println("2. Comprar");
			System.out.println("3. Mostrar compras");
			System.out.println("4. Realizar una queja");
			System.out.println("5. Salir");
			numero = Funciones.dimeEntero("Introduce una opcion", sc);
			switch (numero) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4: 
				break;
			}
		} while (numero != 5);	
	}
	}


