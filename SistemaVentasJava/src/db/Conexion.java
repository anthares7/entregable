package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/sistemaventas";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}