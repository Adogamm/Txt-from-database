package articulosDTO;

public class Articulos {
    private Integer id;
    private String categoria;
    private String descripcion;
    private double precio;
    private Integer stock;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private double costo;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getStockMinimo() {
        return stockMinimo;
    }
    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
    public Integer getStockMaximo() {
        return stockMaximo;
    }
    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

}