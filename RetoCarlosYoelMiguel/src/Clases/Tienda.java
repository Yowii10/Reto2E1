package Clases;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//<<<<<<< HEAD
//=======
import Clases.Producto;
/*>>>>>>> branch 'main' of https://github.com/Yowii10/Reto2E1.git*/

public class Tienda {
	private int id;
    private String nombre;
    private Empleado gerente;
    private ArrayList<Producto> productos;

    public Tienda(int id, String nombre, Empleado gerente) {
        this.id = id;
        this.nombre = nombre;
        this.gerente = gerente;
        this.productos = new ArrayList<>();
    }



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

	public Empleado getGerente() {
		return gerente;
	}

	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public void reponer(int cantidad) {
        Random r = new Random();
        int productosAgregados = 0;

        while (productosAgregados < cantidad) {
            int productoId = r.nextInt(1000) + 1;

            boolean idExistente = false;
            for (Producto producto : productos) {
                if (producto.getId() == productoId) {
                    idExistente = true;
                    break;
                }
            }

            if (idExistente == false) {
                String productoNombre = "Producto " + (productosAgregados + 1);
                double precio = 10 + (r.nextDouble(10,101));
                productos.add(new Producto(productoId, productoNombre, precio));
                productosAgregados++;
            }
        }
    }
   

    public void vender(Producto producto) {
        productos.remove(producto);
        if (productos.size() < 5) {
            reponer(5);
        }
    }
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
>>>>>>> branch 'main' of https://github.com/Yowii10/Reto2E1.git
