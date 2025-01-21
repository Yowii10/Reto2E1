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
<<<<<<< HEAD
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
=======
	  private static void verTiendas() {
        tiendas.forEach(System.out::println);
    }

    private static void comprar() {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda;

        do {
            System.out.println("Seleccione una tienda por ID:");
            verTiendas();
            int idTienda = scanner.nextInt();
            tienda = tiendas.stream().filter(t -> t.getId() == idTienda).findFirst().orElse(null);

            if (tienda == null) {
                System.out.println("ID de tienda no válido. Intente nuevamente.");
            }
        } while (tienda == null);

        Producto producto = tienda.venderProducto();
        if (producto != null) {
            cliente.comprarProducto(tienda, producto);
            System.out.println("Producto comprado: " + producto);
        } else {
            System.out.println("No hay productos disponibles en esta tienda.");
        }
    }

    private static void realizarQueja() {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda;

        do {
            System.out.println("Seleccione una tienda por ID:");
            verTiendas();
            int idTienda = scanner.nextInt();
            tienda = tiendas.stream().filter(t -> t.getId() == idTienda).findFirst().orElse(null);

            if (tienda == null) {
                System.out.println("ID de tienda no válido. Intente nuevamente.");
            }
        } while (tienda == null);

        Empleado nuevoGerente = empleados.get(new Random().nextInt(empleados.size()));
        tienda.setGerente(nuevoGerente);
        System.out.println("Nuevo gerente asignado: " + nuevoGerente.getNombre());
    }
}

>>>>>>> branch 'main' of https://github.com/Yowii10/Reto2E1.git
	}


