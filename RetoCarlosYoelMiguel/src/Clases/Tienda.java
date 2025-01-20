package Clases;
import java.util.List;
<<<<<<< HEAD
=======
import Clases.Producto;
>>>>>>> branch 'main' of https://github.com/Yowii10/Reto2E1.git

public class Tienda {

	private int id;
	private String nombre;
	private String gerente;
	private List <Producto> productos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public void reponerProductos(int cantidad) {
    Random random = new Random();
    for (int i = 0; i < cantidad; i++) {
        String nombreProducto = "Producto" + (productos.size() + 1);
        double precio = 10 + (90 * random.nextDouble());
        productos.add(new Producto(nombreProducto, Math.round(precio * 100.0) / 100.0));
    }
}

public Producto venderProducto() {
    if (!productos.isEmpty()) {
        Producto vendido = productos.remove(0);
        if (productos.size() < 5) {
            reponerProductos(5);
        }
        return vendido;
    }
    return null;
}
}
