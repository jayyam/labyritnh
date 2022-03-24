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
            Class.forName("com.mysql.jc.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.0:3306/agenda", "root", "alpurria22");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contacto;");
            while (rs.next()) {
                System.out.println("Contacto " + rs.getInt("id") + ": " + rs.getString("telefono"));
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
        }
    }
}