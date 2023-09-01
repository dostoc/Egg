/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.Persistencia;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author jonak
 */
public final class ProductoDAO extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Producto nulo");
            }
            String sql = "INSERT INTO producto"
                    + "(codigo,nombre,precio,codigo_fabricante) "
                    + "VALUES ( ' " + producto.getCodigo() + " ' , ' " + producto.getNombre() + " ' , ' " + producto.getPrecio() + " ' , ' " + producto.getCodigo_fabricante() + " ');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Producto fuera de listado o no existe");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + producto.getNombre() + "', "
                    + "precio = '" + producto.getPrecio() + "', "
                    + "codigo_fabricante = '" + producto.getCodigo_fabricante() + "', "
                    + "WHERE (codigo = '" + producto.getCodigo() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(String codProd) throws Exception {

        try {
            if (codProd == null) {
                throw new Exception("Codigo nulo");
            }

            String str = "DELETE FROM PRODUCTO "
                    + "WHERE ID=" + codProd + "';";

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listaProductos() throws Exception {
        try {
            Collection<Producto> listado = new ArrayList();
            String srt = "SELECT * FROM PRODUCTO";
            consultarBase(srt);

            Producto prodAux = new Producto();

            while (resultado.next()) {
                prodAux = new Producto();
                prodAux.setCodigo(resultado.getInt(1));
                prodAux.setNombre(resultado.getString(2));
                prodAux.setPrecio(resultado.getDouble(3));
                prodAux.setCodigo_fabricante(resultado.getInt(4));
                listado.add(prodAux);
            }

            return listado;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listaProductosNombre() throws Exception {
        try {
            Collection<Producto> listado = new ArrayList();
            String srt = "SELECT nombre FROM PRODUCTO";
            consultarBase(srt);

            Producto prodAux = new Producto();

            while (resultado.next()) {
                prodAux = new Producto();
                prodAux.setNombre(resultado.getString("nombre"));
                listado.add(prodAux);
            }

            return listado;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listaProductosNombrePrecio() throws Exception {
        try {
            Collection<Producto> listado = new ArrayList();
            String srt = "SELECT nombre,precio FROM PRODUCTO";
            consultarBase(srt);

            Producto prodAux = new Producto();

            while (resultado.next()) {
                prodAux = new Producto();
                prodAux.setNombre(resultado.getString("nombre"));
                prodAux.setPrecio(resultado.getDouble("precio"));
                listado.add(prodAux);
            }

            return listado;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listaProductoMinMax(double pMin, double pMax) throws Exception {

        try {
            if (pMin < 0 || pMin > pMax || pMax < 0) {
                throw new Exception("Precio Minimo o Maximo incoherentes");
            }

            String srt = "SELECT * FROM PRODUCTO WHERE precio > " + pMin + " AND precio < " + pMax + ";";

            consultarBase(srt);
            Collection<Producto> listaProducto = new ArrayList();
            Producto prodAux = new Producto();
            while (resultado.next()) {
                prodAux = new Producto();
                prodAux.setNombre(resultado.getString(2));
                prodAux.setPrecio(resultado.getDouble(3));
                listaProducto.add(prodAux);
            }
            return listaProducto;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    // d) Buscar y listar todos los Portátiles de la tabla producto. 

    public Collection<Producto> buscarPorNombre(String buscado) throws Exception {
        try {

            if (buscado == null) {
                throw new Exception("No hay parametro de busqueda");
            }

            String str = "SELECT * FROM PRODUCTO WHERE "
                    + "NOMBRE LIKE '%" + buscado + "%'";

            consultarBase(str);

            Collection<Producto> listadoProducto = new ArrayList();
            Producto aux = new Producto();
            while (resultado.next()) {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigo_fabricante(resultado.getInt(4));
                listadoProducto.add(aux);
            }

            return listadoProducto;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    // mas barato
    public Producto masBarato() throws Exception {
        try {
            String str = "select * from producto where producto.precio = (select min(producto.precio) from producto);";
            consultarBase(str);
            Producto aux = new Producto();
            aux = null;

            if (resultado.next()) {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigo_fabricante(resultado.getInt(4));
            }
            return aux;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    /*
           pDAO.modificarNombre();
                    break;
                case 2:
                    pDAO.modificarPrecio();
                    break;
                case 2:
                    pDAO.modificarFabricante();
    
     */
    public void modificarNombre(Producto aux,String nuevoNombre) throws Exception {
        try {
            if (aux == null) {
                throw new Exception("Producto nulo");
            }
          
            String srt = ("UPDATE `tienda`.`producto` SET `nombre` = '"+nuevoNombre+"' WHERE (`codigo` = '"+aux.getCodigo()+"');");
            insertarModificarEliminar(srt);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            desconectarBase();
        }
    }

    public ResultSet mostrarProductoCodigo(int codigo) throws Exception {

        try {
            if (codigo < 0) {
                throw new Exception("Codigo invalido");
            }

            String str = "select * from producto,fabricante where fabricante.codigo = (select producto.codigo_fabricante from producto where producto.codigo ="+codigo+");";
            
            consultarBase(str);
            if (resultado.next()) {
                imprimirResultado(resultado);
            }
            return resultado;

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
        

    }

    public void imprimirResultado(ResultSet resultado)throws Exception{
        
            try {
            if (resultado == null) {
                throw new Exception("Error al cargar el resultado");
            }
                System.out.println("COD: "+  resultado.getInt(1) +" | nombre: "+ resultado.getString(2) +" precio $ "+ resultado.getDouble(3)  +" | fabricante: " + resultado.getString(6) );

        } catch (Exception e) {
            throw e;
        }

    }

}
