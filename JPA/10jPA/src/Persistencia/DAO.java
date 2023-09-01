package Persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


    public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER ="root";
    private final String PASSWORD = "M4xi198!";
    private final String DATABASE = "Guia15_JDBC_extra_ej1_tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    /* este metodo lo creo para poder probar el form*/
    
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/Guia15_JDBC_extra_ej1_tienda?useSSL=false";
    String username = "root";
    String password = "root";
    return DriverManager.getConnection(url, username, password);
}
    }

