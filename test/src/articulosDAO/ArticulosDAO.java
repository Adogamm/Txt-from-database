package articulosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import articulosDTO.Articulos;
import articulosDTO.ArticulosAccesorios;
import articulosDTO.ArticulosCalzado;
import articulosDTO.ArticulosRopa;
import articulosDTO.Clientes;
import articulosDTO.Facturas;
import articulosDTO.FacturasDetalles;
import conexionSql.ConexionSql;
import interfaces.Operaciones;

public class ArticulosDAO implements Operaciones<Articulos> {

    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private Connection connection;
    private static final String SQL_READ_ALL_ARTICULOS = "SELECT * FROM ARTICULOS";
    private static final String SQL_READ_ALL_ACCESORIOS_DETALLES = "SELECT * FROM ARTICULOS_ACCESORIOS_DETALLES";
    private static final String SQL_READ_ALL_CALZADO_DETALLES = "SELECT * FROM ARTICULOS_CALZADOS_DETALLES";
    private static final String SQL_READ_ALL_ROPA_DETALLES = "SELECT * FROM ARTICULOS_ROPA_DETALLES";
    private static final String SQL_READ_ALL_CLIENTES = "SELECT * FROM CLIENTES";
    private static final String SQL_READ_ALL_FACTURAS = "SELECT * FROM FACTURAS";
    private static final String SQL_READ_ALL_FACTURAS_DETALLES = "SELECT * FROM FACTURAS_DETALLES";


    @Override
    public List<Articulos> readAllArticulos() {
        List<Articulos> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_ARTICULOS);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Articulos dto = new Articulos();
                dto.setId(resultSet.getInt(1));
                dto.setCategoria(resultSet.getString(2));
                dto.setDescripcion(resultSet.getString(3));
                dto.setPrecio(resultSet.getDouble(4));
                dto.setStock(resultSet.getInt(5));
                dto.setStockMinimo(resultSet.getInt(6));
                dto.setStockMaximo(resultSet.getInt(7));
                dto.setCosto(resultSet.getDouble(7));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<ArticulosAccesorios> readAllAccesoriosDetalles() {
        List<ArticulosAccesorios> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_ACCESORIOS_DETALLES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                ArticulosAccesorios dto = new ArticulosAccesorios();
                dto.setId(resultSet.getInt(1));
                dto.setIdArticulo(resultSet.getInt(2));
                dto.setTipo(resultSet.getString(3));
                dto.setColor(resultSet.getString(4));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<ArticulosCalzado> readAllCalzadoDetalles() {
        List<ArticulosCalzado> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_CALZADO_DETALLES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                ArticulosCalzado dto = new ArticulosCalzado();
                dto.setId(resultSet.getInt(1));
                dto.setIdArticulo(resultSet.getInt(2));
                dto.setTipo(resultSet.getString(3));
                dto.setUsabilidad(resultSet.getString(4));
                dto.setNumero(resultSet.getInt(5));
                dto.setColor(resultSet.getString(6));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<ArticulosRopa> readAllRopaDetalles() {
        List<ArticulosRopa> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_ROPA_DETALLES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                ArticulosRopa dto = new ArticulosRopa();
                dto.setId(resultSet.getInt(1));
                dto.setIdArticulo(resultSet.getInt(2));
                dto.setTipo(resultSet.getString(3));
                dto.setUsabilidad(resultSet.getString(4));
                dto.setTalle(resultSet.getString(5));
                dto.setTemporada(resultSet.getString(6));
                dto.setColor(resultSet.getString(7));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<Clientes> readAllClientes() {
        List<Clientes> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_CLIENTES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Clientes dto = new Clientes();
                dto.setId(resultSet.getInt(1));
                dto.setNombre(resultSet.getString(2));
                dto.setApellido(resultSet.getString(3));
                dto.setEdad(resultSet.getInt(4));
                dto.setDireccion(resultSet.getString(5));
                dto.setDireccion(resultSet.getString(6));
                dto.setTelefono(resultSet.getString(7));
                dto.setTipoDocumento(resultSet.getString(8));
                dto.setNumeroDocumento(resultSet.getString(9));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<Facturas> readAllFacturas() {
        List<Facturas> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_FACTURAS);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Facturas dto = new Facturas();
                dto.setId(resultSet.getInt(1));
                dto.setIdCliente(resultSet.getInt(2));
                dto.setIdArticulo(resultSet.getInt(3));
                dto.setPrecio(resultSet.getDouble(4));
                dto.setCantidad(resultSet.getInt(5));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }


    @Override
    public List<FacturasDetalles> readAllFacturasDetalles() {
        List<FacturasDetalles> lista = new ArrayList<>();
        try {
            ConexionSql conexionSql = new ConexionSql();
            connection = conexionSql.conexion();
            preparedStatement = connection.prepareStatement(SQL_READ_ALL_FACTURAS_DETALLES);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                FacturasDetalles dto = new FacturasDetalles();
                dto.setId(resultSet.getInt(1));
                dto.setIdFactura(resultSet.getInt(2));
                dto.setTipo(resultSet.getString(3));
                dto.setNumero(resultSet.getLong(4));
                dto.setfechaEmision(resultSet.getString(5));
                dto.setMedioDePago(resultSet.getString(6));
                dto.setDescripcion(resultSet.getString(7));
                lista.add(dto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
    
}
