package conexionSql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionSql {
    Connection connection = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db_indumentaria", "root", "Pkwed*0115");
        } catch (Exception e) {
            System.out.println(e);
        }

        return connection;
    }
}
