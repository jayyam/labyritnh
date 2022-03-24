package Classes.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Select2
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un nombre a buscar: ");
    String nombre = teclado.nextLine();
    lanzarConsulta(nombre);
    }

    private static void lanzarConsulta(String nombre)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda", "root", "fran");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contacto WHERE nombre LIKE '%" + nombre + "%';");
            while (rs.next()) {
                System.out.println("Contacto " + rs.getInt("id") + ": " + rs.getString("nombre") + " " + rs.getString("email") + " " + rs.getString("telefono"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
    }
}