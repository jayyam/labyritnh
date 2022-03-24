package Database;//test.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert2
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("email: ");
        String email = teclado.nextLine();
        System.out.print("telefono: ");
        String telefono = teclado.nextLine();
        insertarContacto(nombre, email, telefono);
    }
    public static void insertarContacto(String nombre, String email, String telefono)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda","root","alpurria22");
            Statement stmt =conn.createStatement();

            stmt.executeUpdate("INSERT INTO contacto(nombre,email,telefono) VALUES ('" +nombre+ "','" +email+ "','" +telefono+ "');");
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
        }
    }
}
