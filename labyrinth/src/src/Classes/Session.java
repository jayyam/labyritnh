package src.Classes;

public class Session 

{
	private boolean logged;
	
	private User user= new User();//declarando e inicializando el metodo
	
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
}

/**currentUser.username = "omarsantana";
currentUser.name = "Omar Alfonso Garcia Santana";
currentUser.age = "96";
currentUser.DNI = "48658503S";
currentUser.email = "omardpana22@gmail.com";
currentUser.address = "C/ orellana, 1, 1H";
currentUser.birthdate = "33/22/1900";
currentUser.role = "usuario";*/
