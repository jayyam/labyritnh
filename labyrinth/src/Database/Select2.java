package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select2
{
    public static void main(String[] args)
    {
        lanzarConsulta();
    }
    public static void lanzarConsulta()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "alpurria22");
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO users(username,password,name,nif,email,address,birthdate,role) VALUES ('admin','123','administrador','11111111Y','omardpana22@gmail.com','c/Fco de orellana #1 1-H','22/11/22','admin');");
            /**while (rs.next()) {
                System.out.println("Users " + rs.getInt("id") + ": " + rs.getString("telefono"));
            }*/
            stmt.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
        }
    }
}