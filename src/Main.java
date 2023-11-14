import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Producto producto1 = new Producto("Coca-Cola Zero", 1.5, 20);
        productos.add(producto1);
        Producto producto2 = new Producto("Coca-Cola", 1.5, 18);
        productos.add(producto2);
        Producto producto3 = new Producto("Shampoo Sedal", "500ml", 19);
        productos.add(producto3);
        Producto producto4 = new Producto("Frutillas", 64, "kilo");
        productos.add(producto4);

        for(int i = 0; i < productos.size(); i++){
            Producto producto = productos.get(i);
            System.out.println(producto.toString());
        }
        System.out.println("=============================");
        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);
        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());

    }
}