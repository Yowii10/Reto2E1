package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Cliente {
	private String nombre;
	private Map<Tienda, List<Producto>> compra1;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Tienda, List<Producto>> getCompra1() {
		return compra1;
	}

	public void setCompra1(Map<Tienda, List<Producto>> compra1) {
		this.compra1 = compra1;
	}
	public Cliente() {
		super();
		this.compra1 = new HashMap<Tienda, List<Producto>>();

	}
	
public Cliente(String nombre) {
		super();
		this.nombre = nombre;
		this.compra1 = new HashMap<Tienda, List<Producto>>();
	}




	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", compra=" + compra1 + "]";
	}

	public void comprarProducto(Tienda tienda, Producto producto) {

		List<Producto> lista;

		if (tienda.getProductos() == null) {

			lista = new ArrayList<Producto>();

		} else {

			lista = tienda.getProductos();

		}

		lista.add(producto);

		compra1.put(tienda, lista);

		System.out.println(compra1);

	}

	public void gastoTotal() {

		Tienda tienda;

		List<Producto> listaProd;

		double suma = 0;

		Iterator<Tienda> claves = compra1.keySet().iterator();

		while (claves.hasNext()) {

			tienda = claves.next();

			listaProd = tienda.getProductos();

			for (Producto producto : listaProd) {

				suma += producto.getPrecio();

			}

		}
	}
}
