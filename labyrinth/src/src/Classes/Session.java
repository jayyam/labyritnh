package src.Classes;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Session

{
	private User user = new User();// declarando e inicializando el metodo
	private boolean logged;

	public Session()// Constructor Session

	{
		logged = false;
	}

	public boolean isLogged() // DEvuelve el estado actual de la sesion

	{
		return logged;
	}

	public User getUser() // Devuelve el estado actual del usuario

	{
		return user;
	}

	/**
	 * LOGIN clase 1 - pedir usuario 2 - pedir password 3 - leer users.txt 4 -
	 * validar user y password 5A - correcto=loggedtrue//guardar en constructor user
	 * los datos 5B - incorrecto=loggedfalse// mensaje de error+fin de login
	 */
	public void Login() {
		String username = Interface.getString("Introduce Usuario: ");
		String password = Interface.getString("Introduzca contraseña: ");

		ArrayList<String> users = readUserFile();
		//System.out.println("A");
		for (int i = 0; i < users.size(); i++) {
			String[] currentUser = users.get(i).split("#");
			//System.out.println("B " + users.get(i));
			if (username.equalsIgnoreCase(currentUser[0]) && password.equals(currentUser[1])) {
				//System.out.println("C");
				logged = true;
				setUser(currentUser);
				System.out.println(username + "\nHa iniciado sesion con exito!");
				break;
			}
		}
		//System.out.println("D");
		if (!logged) {
			//System.out.println("Z");
			System.err.println(username + "\nUsuario o Contraseña incorrecto!");
		}
	}

	// Devuelve un Array con todos los usuarios
	private ArrayList<String> readUserFile() {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			File myObj = new File(Config.FILEPATH + Config.USERSFILE);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				lines.add(line);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Un error occurred.");
			e.printStackTrace();
		}
		return lines;
	}

	public void ShowUser()// Devuelve los datos de usuario

	{
		System.out.println("Usuario: " + user.username);
		System.out.println("Nombre de usuario: " + user.name);
		System.out.println("Edad: " + user.age);
		System.out.println("NIF: " + user.DNI);
		System.out.println("Correo electronico: " + user.email);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate);
		System.out.println("Nombre de usuario: " + user.role);

		Interface.toContinue();
	}

	public void logout() // Cerrar sesion y establecer propiedades de usuario

	{
		logged = false;
		user = new User();
	}

	/**
	 * SIGNUP (REGISTRO)
	 * 
	 * 1 - Pedir username 2 - Leer fichero users.txt 3 - Busca coincidencia de
	 * username (COMPROBACION). 4A - Si hay coincidencias --> ("Usuario ya
	 * existe")--> FIN 4B -Si NO hay coincidencias --> Pedir el resto de campos 5 -
	 * Construimos la nueva linea 6 - Escribir la linea en users.txt 7 - FIN
	 */

	private boolean checkUser(String username) {
		boolean found = false;
		ArrayList<String> users = readUserFile(); // Paso 2

		for (int i = 0; i <= users.size(); i++) // Paso 3
		{
			String[] currentUser = users.get(i).split("#");
			if (username.equalsIgnoreCase(currentUser[0])) {
				System.out.println(username + "\nError!");
				found = true;
				break;
			}
		}
		return found;
	}

	public void singupV1()

	{
		String username = Interface.getString("Nombre de usuario?: ");
		if (checkUser(username)) 
		{
			System.out.println("\nEl usuario "+ username + " ya existe!");
			return;
		}
		// paso4
		String password = Interface.getString("Contraseña?: ");
		String name = Interface.getString("Nombre completo?: ");
		String age = Interface.getString("Edad?: ");
		String DNI = Interface.getString("DNI/NIF?: ");
		String email = Interface.getString("Email?: ");
		String address = Interface.getString("Direccion?: ");
		String birthdate = Interface.getString("Fecha de nacimiento?: ");

		// paso5
		String newUser = "\n" + username + "#" + password + "#" + name + "#" + age + "#" + DNI + "#" + email + "#"
				+ address + "#" + birthdate + "#user";

		// Paso 6
		boolean result = writeUser(newUser);
		if (result) {
			System.out.println("Usuario registrado correctamente!");
		} else {
			System.out.println("error occurred.");
		}
	}

	/**
	 * public void singupV2() { String username = ""; for (int i=0;
	 * i<Config.FIELDS.lenght;i++) { String aux =
	 * Interface.getString(Config.FIELDS[i]] + ": "); if (i==0 && checkUser(aux)) {
	 * System.out.println(username + "\n ya existe!"); return; } newUser += aux +
	 * "#"; }
	 * 
	 * 
	 * 
	 * }
	 */

	private boolean writeUser(String newUser) {
		boolean success = false;

		try {
			FileWriter myWriter = new FileWriter(Config.FILEPATH + Config.USERSFILE, true);
			myWriter.write(newUser);
			myWriter.close();
			success = true;
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
		return success;
	}

	private void setUser(String[] currentUser) {
		user.username = currentUser[0];
		user.name = currentUser[2];
		user.age = currentUser[3];
		user.DNI = currentUser[4];
		user.email = currentUser[5];
		user.address = currentUser[6];
		user.birthdate = currentUser[7];
		user.role = currentUser[8];
	}
}
