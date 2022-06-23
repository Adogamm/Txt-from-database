package interfaces;

import java.util.List;

import articulosDTO.ArticulosAccesorios;
import articulosDTO.ArticulosCalzado;
import articulosDTO.ArticulosRopa;
import articulosDTO.Clientes;
import articulosDTO.Facturas;
import articulosDTO.FacturasDetalles;

public interface Operaciones <Crud> {
    public List<Crud> readAllArticulos();
    public List<ArticulosAccesorios> readAllAccesoriosDetalles();
    public List<ArticulosCalzado> readAllCalzadoDetalles();
    public List<ArticulosRopa> readAllRopaDetalles();
    public List<Clientes> readAllClientes();
    public List<Facturas> readAllFacturas();
    public List<FacturasDetalles> readAllFacturasDetalles();
}
