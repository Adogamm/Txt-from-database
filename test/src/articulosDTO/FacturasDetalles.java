package articulosDTO;

public class FacturasDetalles {
    int id;
    int idFactura;
    String tipo;
    long numero;
    String fechaEmision;
    String medioDePago;
    String descripcion;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public String getfechaEmision() {
        return fechaEmision;
    }
    public void setfechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public String getMedioDePago() {
        return medioDePago;
    }
    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
