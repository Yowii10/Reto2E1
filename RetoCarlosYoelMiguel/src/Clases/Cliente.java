package Clases;

import java.util.List;

public class Cliente {
private String nombre;
private List<Tienda> compra;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public List<Tienda> getCompra() {
	return compra;
}
public void setCompra(List<Tienda> compra) {
	this.compra = compra;
}
public Cliente(String nombre, List<Tienda> compra) {
	super();
	this.nombre = nombre;
	this.compra = compra;
}
public Cliente() {
	super();
}
@Override
public String toString() {
	return "Cliente [nombre=" + nombre + ", compra=" + compra + "]";
}
	 public void comprarProducto(Tienda tienda, Producto producto) {
	        compras.putIfAbsent(tienda, new ArrayList<>());
	        compras.get(tienda).add(producto);
	    }

	    public double gastoTotal() {
	    	for (List<Producto> productosComprados : compras.values()) { 
	    		for (Producto producto : productosComprados) 
	    		{ total += producto.getPrecio(); } 
	    		} 
	    	return total; }

	    public void mostrarCompras() {
	        compras.forEach((tienda, productos) -> {
	            System.out.println("Tienda: " + tienda.getNombre() + " - Productos: " + productos.size());
	        });
	        System.out.println("Gasto total: " + gastoTotal() + "€");
	    }
	}

}
