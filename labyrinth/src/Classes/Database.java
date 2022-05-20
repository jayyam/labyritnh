/**
 * Database.java.
 * Clase de interaccion con la base de datos
 * OAGS - 2021/22
 * version v1.2.0
 */
package Classes;

import java.sql.*;

public class Database
{

    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/labyrinth";
    static final String USER = "root";
    static final String PASSWD = "alpurria22";
    static final String QUERYCREATE = "INSERT INTO users(username,password,name,email,nif,address,birthdate,role) VALUES ('<username>','<password>','<name>','<email>','<nif>','<address>','<birthdate>','<role>')";
    static final String QUERYUPDATE = "";
    static final String QUERYDELETE = "";
    static final String QUERYLogin = "SELECT * FROM users WHERE username='<username>'AND password='<password>';";

    /**
     public static boolean checkUser()word
     {
        if (//existe)
            {
                return true
            }
        return false;
     }
    */
    public static Boolean Signup(String username,String password,String name,String nif,String email,String address,String birthdate,String role)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            Statement stmt = conn.createStatement();
            String query = QUERYCREATE.replaceAll("<username>",username)
                                      .replaceAll("<password>",password)
                                      .replaceAll("<name>",name)
                                      .replaceAll("<nif>",nif)
                                      .replaceAll("<email>",email)
                                      .replaceAll("<address>",address)
                                      .replaceAll("<birthdate>",birthdate)
                                      .replaceAll("<role>",role);
            stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
            return false;
        }
        return true;
    }
    public static User Login(String username, String password)
    {
        User user = new User();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            Statement stmt = conn.createStatement();
            String query = QUERYLogin.replaceAll("<username>",username)
                                     .replaceAll("<password>",password);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
            {
                user.id = rs.getInt("id");
                user.username = rs.getString("username");
                user.name = rs.getString("name");
                user.nif = rs.getString("nif");
                user.email = rs.getString("email");
                user.address = rs.getString("address");
                user.birthdate = rs.getString("birthdate");
                user.role = rs.getString("role");
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("ERROR" + e);
            return null;
        }
        return user;
    }
}