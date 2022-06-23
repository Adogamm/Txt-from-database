import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import articulosDAO.ArticulosDAO;
import articulosDTO.Articulos;
import articulosDTO.ArticulosAccesorios;
import articulosDTO.ArticulosCalzado;
import articulosDTO.ArticulosRopa;
import articulosDTO.Clientes;
import articulosDTO.Facturas;
import articulosDTO.FacturasDetalles;

public class App {

    public static ArticulosDAO dao = new ArticulosDAO();
    public static void main(String[] args) throws Exception {
        
        while(true) {
            System.out.println("Ingrese la opcion a realizar\n1) Consulta articulos\n2) Consulta articulos accesorios\n3) Consulta articulos Calzado\n4) Consulta articulos ropa\n5) Consulta clientes\n6) Consulta facturas\n7) Consulta facturas detalles\n8) Salir");
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            if(opcion==1) {
                System.out.println("\n");
                readAllArticulos();
                System.out.println("\n");
            } else if(opcion==2){
                System.out.println("\n");
                readAllAccesoriosDetalles();
                System.out.println("\n");
            } else if(opcion==3){
                System.out.println("\n");
                readAllCalzadoDetalles();
                System.out.println("\n");
            } else if(opcion==4){
                System.out.println("\n");
                readAllRopaDetalles();;
                System.out.println("\n");
            } else if(opcion==5){
                System.out.println("\n");
                readAllClientes();
                System.out.println("\n");
            } else if(opcion==6){
                System.out.println("\n");
                readAllFacturas();
                System.out.println("\n");
            } else if(opcion==7){
                System.out.println("\n");
                readAllFacturasDetalles();
                System.out.println("\n");
            } else if(opcion==8){
                System.out.println("\n");
                System.out.println("Muchas gracias por usar el sistema. Hasta luego");
                System.out.println("\n");
                break;
            } else {
                System.out.println("\n");
                System.out.println("ERROR: Solo se aceptan las opciones 1-8");
                System.out.println("\n");
            }
        }
    }
    
    private static void readAllFacturasDetalles() {
        try{
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<FacturasDetalles> lista = new ArrayList<>();
            lista = dao.readAllFacturasDetalles();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getIdFactura()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getNumero()+" | "+lista.get(i).getfechaEmision()+" | "+lista.get(i).getMedioDePago()+" | "+lista.get(i).getDescripcion());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getIdFactura()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getNumero()+" | "+lista.get(i).getfechaEmision()+" | "+lista.get(i).getMedioDePago()+" | "+lista.get(i).getDescripcion()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    private static void readAllFacturas() {
        try{
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<Facturas> lista = new ArrayList<>();
            lista = dao.readAllFacturas();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getIdCliente()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getPrecio()+" | "+lista.get(i).getCantidad());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getIdCliente()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getPrecio()+" | "+lista.get(i).getCantidad()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private static void readAllClientes() {
        try{
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<Clientes> lista = new ArrayList<>();
            lista = dao.readAllClientes();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getNombre()+" | "+lista.get(i).getApellido()+" | "+lista.get(i).getEdad()+" | "+lista.get(i).getDireccion()+" | "+lista.get(i).getEmail()+" | "+lista.get(i).getTelefono()+" | "+lista.get(i).getTipoDocumento()+" | "+lista.get(i).getNumeroDocumento());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getNombre()+" | "+lista.get(i).getApellido()+" | "+lista.get(i).getEdad()+" | "+lista.get(i).getDireccion()+" | "+lista.get(i).getEmail()+" | "+lista.get(i).getTelefono()+" | "+lista.get(i).getTipoDocumento()+" | "+lista.get(i).getNumeroDocumento()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    private static void readAllRopaDetalles() {
        try{
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<ArticulosRopa> lista = new ArrayList<>();
            lista = dao.readAllRopaDetalles();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getUsabilidad()+" | "+lista.get(i).getTalle()+" | "+ lista.get(i).getTemporada()+" | "+lista.get(i).getColor());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getUsabilidad()+" | "+lista.get(i).getTalle()+" | "+ lista.get(i).getTemporada()+" | "+lista.get(i).getColor()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private static void readAllCalzadoDetalles() {
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<ArticulosCalzado> lista = new ArrayList<>();
            lista = dao.readAllCalzadoDetalles();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getUsabilidad()+" | "+lista.get(i).getNumero()+" | "+lista.get(i).getColor());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getUsabilidad()+" | "+lista.get(i).getNumero()+" | "+lista.get(i).getColor()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private static void readAllAccesoriosDetalles() {
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<ArticulosAccesorios> lista = new ArrayList<>();
            lista = dao.readAllAccesoriosDetalles();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getColor());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getIdArticulo()+" | "+lista.get(i).getTipo()+" | "+lista.get(i).getColor()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    private static void readAllArticulos() {
        try {
            FileWriter fichero = new FileWriter("C:\\Users\\adolfo.leon\\Documents\\vsc\\Ejercicio1\\test\\src\\TextFiles\\miConsulta.txt");
            List<Articulos> lista = new ArrayList<>();
            lista = dao.readAllArticulos();
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).getId()+" | "+lista.get(i).getDescripcion()+" | "+lista.get(i).getPrecio()+" | "+lista.get(i).getStock()+" | "+lista.get(i).getStockMinimo()+" | "+lista.get(i).getStockMaximo()+" | "+lista.get(i).getCosto());
                fichero.write(lista.get(i).getId()+" | "+lista.get(i).getDescripcion()+" | "+lista.get(i).getPrecio()+" | "+lista.get(i).getStock()+" | "+lista.get(i).getStockMinimo()+" | "+lista.get(i).getStockMaximo()+" | "+lista.get(i).getCosto()+"\n");
            }
            System.out.println("Archivo generado con éxito");
            fichero.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
