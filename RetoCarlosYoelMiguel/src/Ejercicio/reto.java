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
		Cliente clientes = new Cliente("nombre");
		for (int i = 0; i < 20; i++) {
			Empleado empleado= new Empleado("nombre" + i, r.nextInt(2,21));

			empleados.add(empleado);
		}
		
		for (int i = 0; i < 5; i++) {
			
			Tienda tienda= new Tienda(numero,"tienda"+i, empleados.get(r.nextInt(0, empleados.size())));
			tiendas.add(tienda);
			
		}
		do {
			System.out.println("1. Ver tiendas");
			System.out.println("2. Comprar");
			System.out.println("3. Mostrar compras");
			System.out.println("4. Realizar una queja");
			System.out.println("5. Salir");
			numero = Funciones.dimeEntero("Introduce una opcion", sc);
			switch (numero) {
			case 1:
				mostrarTiendas(tiendas);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4: 
				realizarQueja();
				break;
			case 5: 
				
				break;
			}
		} while (numero != 5);	
	}

	public static void reponerTienda(Tienda tienda, Random r) {

		int nRandom = r.nextInt(5, 11);

		int id;

		double precio;

		List<Producto> lista = new ArrayList<Producto>();

		

		for (int i = 0; i < nRandom; i++) {

			id = r.nextInt(1,100);

			precio = Math.round(r.nextDouble(10,101)*100)/100.0;

			Producto producto = new Producto(id, "Producto" + id, precio);

			

			//si no había lista, usa la nueva y la mete

			if (tienda.getProductos() == null) {

				lista.add(producto);

				tienda.setProductos(lista);

				

			//si había lista, la coge, añade el producto y la vuelve a meter

			} else {

				lista = tienda.getProductos();

				lista.add(producto);

				tienda.setProductos(lista);

			}

		}

	}
	public void generarProducto () {
		Random r = new Random();
		int id1 = r.nextInt(1,1000);
		String nombre = "nombre"+id1;
		double precio = r.nextDouble(1,100000);
		
		Producto producto1 = new Producto(id1,nombre,precio);
	}

	public static void mostrarTiendas( List<Tienda> tienda) {
		for (Tienda tienda2 : tienda) {
			System.out.println(tienda2);
		}
	}
		
	
	


    public static void realizarQueja() {

		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		

		Tienda t1 = tienda.get(0);
		t1.setGerente(empleado.get(r.nextInt(0, empleado.size())));

		int id_gerente = 0;

		Empleado nuevo = null;

		id_gerente = r.nextInt(1,21);

		for (Empleado empleado : empleado) {

			if (tienda.getId() == id_gerente) {

				nuevo = empleado;

				empleado.setAntiguedad(id_gerente);

			}

		}

		

		tienda.setGerente(nuevo);

	}


	}


