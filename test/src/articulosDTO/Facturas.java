package articulosDTO;

public class Facturas {
    int id;
    int idCliente;
    int idArticulo;
    double precio;
    int cantidad;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
