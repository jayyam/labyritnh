package Classes;

import java.sql.*;

public class Database
{
    static final String DB_URL= "jdbc:mysql://127.0.0.1:3306/labyrinth";
    static final String USER = "root";
    static final String PASSWD = "alpurria22";
    static final String QUERYCREATE = "INSERT INTO users(username,password,name,email,DNI,address,birthdate,role) VALUES ('omar','Contraseña%2','usuario user','nanoshays22@gmail.com','48055673X','c/Fco de orellana #1 1-H','1983-10-22','user')";
    static final String QUERYRETRIEVE = "SELECT * FROM users WHERE id = 1";
    static final String QUERYUPDATE = "";
    static final String QUERYDELETE = "";
    public static void main(String[] args)//Pruebas. Borrar
    {
        //spearCREATE();
        //spearRETRIEVE();
    }
    /**public static boolean login(User user)
     {
        if (existe){return User;}
        return null;
     }
     public static boolean checkUser()
     {
        if (//existe)
            {
                return true
            }
        return false;
     }
     public static boolean signup()
     {
        if (//existe)
        {
            return true;
        }
        return false;
     }
     */
    public static void spearCREATE()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(QUERYCREATE);
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
        }
    }
    public static void spearRETRIEVE()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERYRETRIEVE);
            while (rs.next()) {
                System.out.println(
                                 rs.getInt("id")
                          +"\n"+ rs.getString("username")
                          +"\n"+ rs.getString("password")
                          +"\n"+ rs.getString("name")
                          +"\n"+ rs.getString("email")
                          +"\n"+ rs.getString("DNI")
                          +"\n"+ rs.getString("address")
                          +"\n"+ rs.getString("birthdate")
                          +"\n"+ rs.getString("role")
                );
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