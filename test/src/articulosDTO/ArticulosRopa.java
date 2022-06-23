package articulosDTO;

public class ArticulosRopa {
    int id;
    int idArticulo;
    String tipo;
    String usabilidad;
    String talle;
    String temporada;
    String color;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdArticulo() {
        return idArticulo;
    }
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getUsabilidad() {
        return usabilidad;
    }
    public void setUsabilidad(String usabilidad) {
        this.usabilidad = usabilidad;
    }
    public String getTalle() {
        return talle;
    }
    public void setTalle(String talle) {
        this.talle = talle;
    }
    public String getTemporada() {
        return temporada;
    }
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
