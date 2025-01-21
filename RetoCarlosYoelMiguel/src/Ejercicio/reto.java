package Ejercicio;

import java.util.*;
import java.io.*;
import Clases.*;
import Util.Funciones;

public class reto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int numero = 0;
		List<Empleado> empleados = new ArrayList();
		List<Tienda> tiendas = new ArrayList();
		List<Cliente> clientes = new ArrayList();
		for (int i = 0; i < 20; i++) {
			Empleado empleado= new Empleado("nombre" + i, r.nextInt(2,21));

			empleados.add(empleado);
		}
		
		for (int i = 0; i < 5; i++) {
			
			Tienda tienda= new Tienda(numero,"nombre", );
			
		}
		clientes.add(generarCliente);
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
	public void generarEmpleado(Tienda tienda) {
				empleado.get(new Random().nextInt(empleado.size()));

        tienda.setGerente(nuevoGerente);

        System.out.println("Nuevo gerente asignado: " + nuevoGerente.getNombre());
	}
	public void generarProducto () {
		Random r = new Random();
		int id1 = r.nextInt(1,1000);
		String nombre = "nombre"+id1;
		double precio = r.nextDouble(1,100000);
		
		Producto producto1 = new Producto(id1,nombre,precio);
	}
	}


