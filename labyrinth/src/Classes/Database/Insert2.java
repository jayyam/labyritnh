package Classes.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert2//modificado para agregar en db laberinto
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("username: ");
        String username = teclado.nextLine();
        System.out.print("name: ");
        String name = teclado.nextLine();
        System.out.print("age: ");
        String age = teclado.nextLine();
        System.out.print("DNI: ");
        String DNI = teclado.nextLine();
        System.out.print("email: ");
        String email = teclado.nextLine();
        System.out.print("address: ");
        String address = teclado.nextLine();
        System.out.print("birthdate: ");
        String birthdate = teclado.nextLine();
        System.out.print("role: ");
        String role = teclado.nextLine();
        insertarContacto(username, name, age, DNI, email, address, birthdate, role);
    }
    public static void insertarContacto(String username, String name, String age, String DNI, String email, String address, String birthdate, String role)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth","root","alpurria22");
            Statement stmt =conn.createStatement();

            stmt.executeUpdate("INSERT INTO users(username, name, age, DNI, email, address, birthdate, role) VALUES ('" +username+ "','" +name+ "','" +age+ "','" +DNI+ "','" +email+ "','" +address+ "','" +birthdate+ "','" +role+ "');");
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
        }
    }
}
