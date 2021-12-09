package src.Classes;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Session 

{
	private User user= new User();//declarando e inicializando el metodo
	private boolean logged;
	
	public Session()//Constructor Sesion
	
	{
		logged = false;
	}
	
	public boolean isLogged() //DEvuelve el estado actual de la sesion
	
	{
		return logged;	
	}
	
	public User getUser() //Devuelve el estado actual del usuario
	
	{
		return user;
	}
	//Metodo que hace el Login
	public void Login() 
	{
		String username = Interface.getString("Introduce Usuario: ");
	    String password = Interface.getString("Introduzca contraseña: ");
	    
	    ArrayList<String> users = readUserFile();
	    
	    for (int i=0; i<=users.size();i++) 
	    	{
	    		String[] currentUser=users.get(i).split("#");
	    		
	    		if(username.equalsIgnoreCase(currentUser[0]) && password.equals(currentUser[1])) 
	    		{
	    			logged = true;
	    			System.out.println(username + "\nha iniciado sesion con exito!");
	    			break;
	    		}
	    		if(!logged) 
	    		{
	    			System.err.println(username + "\nUsuario o Contraseña incorrecto!");
	    		}
	    		
	    	}
	}
	
	//Devuelve un Array con todos los usuarios
	private ArrayList<String> readUserFile()
	  {	
		  ArrayList<String> lines = new ArrayList<String>();
		  try 
		    {
		      File myObj = new File(Config.FILEPATH + Config.USERSFILE);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) 
		      {
		        String line = myReader.nextLine();
		        System.out.println(lines);
		      }
		      myReader.close();
		    }
		  catch (FileNotFoundException e) 
		    {
		      System.out.println("Un error occurred.");
		      e.printStackTrace();
		    }
		  return lines;
	  }
	
	public void ShowUser()//Devuelve los datos de usuario
	
	{
			System.out.println("Usuario: "+ user.username);
			System.out.println("Nombre de usuario: "+ user.name);
			System.out.println("Edad: "+ user.age);
			System.out.println("NIF: "+ user.DNI);
			System.out.println("Correo electronico: "+ user.email);
			System.out.println("Direccion: "+ user.address);
			System.out.println("Fecha de nacimiento: "+ user.birthdate);
			System.out.println("Nombre de usuario: "+ user.role);
			
			Interface.toContinue();
	}
	
	public void logout() //Cerrar sesion y establecer propiedades de usuario
	
	{
		logged = false;
		user =new User();
	}
	
	private void setUser(String[] currentUser) 
	{
	 /**currentUser.username = "omarsantana";
		currentUser.name = "Omar Alfonso Garcia Santana";
		currentUser.age = "96";
		currentUser.DNI = "48658503S";
		currentUser.email = "omardpana22@gmail.com";
		currentUser.address = "C/ orellana, 1, 1H";
		currentUser.birthdate = "33/22/1900";
		currentUser.role = "usuario";
	  */	
	}
	
	
}


