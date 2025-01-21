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

    public String getNombre() {
        return nombre;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
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