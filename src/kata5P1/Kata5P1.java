package kata5P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static kata5P1.CrearTabla.CrearTabla;

public class Kata5P1 {

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
        CrearTabla();
    }
}
