public class Producto implements Comparable<Producto>{
    private String nombre;
    private double litros;
    private int precio;
    private String contenido;
    private String unidadDeVenta;

    public Producto(String nombre, double litros, int precio) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
    }
    public Producto(String nombre, String contenido, int precio){
        this.nombre = nombre;
        this.contenido = contenido;
        this.precio = precio;
    }

    public Producto(String nombre, int precio, String unidadDeVenta) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        if (unidadDeVenta != null) {
            return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadDeVenta;
        } else if(contenido != null){
            return "Nombre: " + nombre + " /// Contenido: " +  contenido + " /// Precio: $" + precio;
        } else{
            return "Nombre: " + nombre + " /// Litros: " +  litros + " /// Precio: $" + precio;
        }
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Integer.compare(this.precio, otroProducto.precio);
    }
}
