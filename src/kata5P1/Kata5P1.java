package kata5P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import static kata5P1.CrearTabla.CrearTabla;

public class Kata5P1 {

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
        CrearTabla();
        String filename = new String("C:\\Users\\anime\\OneDrive\\Documentos\\NetBeansProjects\\Kata_4\\email.txt");
        List <String> list = MailListReader.read(filename);
        InsertarDatosTabla idt = new InsertarDatosTabla();
        for (String string : list) {
          idt.insert(string);  
        }
    }
}
