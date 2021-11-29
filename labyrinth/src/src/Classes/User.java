package src.Classes;


public class User

{
	public String username;
	public String name;
	public String age;
	public String DNI;
	public String email;
	public String address;
	public String birthdate;
	public String role;
	
	public void ShowUser() //debe ir en session

	{
		System.out.println("usuario: " + username);
		System.out.println("Nombre de usuario: " + name);
		System.out.println("Edad: " + age);
		System.out.println("NIF: " + DNI);
		System.out.println("Correo electronico: " + email);
		System.out.println("Direccion: " + address);
		System.out.println("Fecha de nacimiento: " + birthdate);
		System.out.println("Nombre de usuario: " + role);
	}
	
	/**User currentUser = new User();
	
	currentUser.username = "omarsantana";
	currentUser.name = "Omar Alfonso Garcia Santana";
	currentUser.age = "96";
	currentUser.DNI = "48658503S";
	currentUser.email = "omardpana22@gmail.com";
	currentUser.address = "C/ orellana, 1, 1H";
	currentUser.birthdate = "33/22/1900";
	currentUser.role = "usuario";
	
	*/
}

