/**
 * Session.java.
 * Clase del sistema para resolver las sesiones
 * OAGS - 2021/22
 * version v1.0.0
 */

package Classes;

import javax.naming.Name;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Session
{
	private User user = new User();// declarando e inicializando el objeto
	private boolean logged;
	public Session() {logged = false;}// Constructor Session
	public boolean isLogged() {return logged;} // Devuelve el estado actual de la sesion
	public void Login() {
		String username = Interface.getString("Introduce Usuario: ");
		String password = Interface.getString("Introduzca contraseña: ");
		ArrayList<String> users = readUserFile();
		//System.out.println("A");//test
		for (int i = 0; i < users.size(); i++) {
			String[] currentUser = users.get(i).split("#");
			//System.out.println("B " + users.get(i));//test
			if (username.equalsIgnoreCase(currentUser[0]) && password.equals(currentUser[1])) {
				//System.out.println("C");//test
				logged = true;
				setUser(currentUser);
				System.out.println(username + "\nHa iniciado sesion con exito!");
				break;
			}
		}
		//System.out.println("D");//test
		if (!logged) {
			//System.out.println("Z");//test
			System.err.println(username + "\nUsuario o Contraseña incorrecto!");
		}
	}
	private boolean checkUser(String username) {
		boolean found = false;
		ArrayList<String> users = readUserFile(); // Paso 2

		for (int i = 0; i < users.size(); i++) // Paso 3
		{
			String[] currentUser = users.get(i).split("#");
			if (username.equalsIgnoreCase(currentUser[0])) {
				System.err.println(username + "\nError ya existe!");
				found = true;
				break;
			}
		}
		return found;
	}

	public void signupV1()
	{
		String username = Interface.getString("Nombre de usuario ?: ");
		if ((checkUser(username)) || (Utils.validateUsername(username) == true))
		{
			System.err.println("\nEl usuario "+username+" ya existe o el formato no es valido");
			return;
		}
		String password = Interface.getString("Contraseña?: ");
		if(Utils.validatePassword(password) == true) {return;}
		String name = Interface.getString("Nombre completo?: ");
		if (Utils.validateName(name) == true){return;}
		String email = Interface.getString("Email?: ");
		if (Utils.validateEmail(email) == true){return;}
		String DNI = Interface.getString("DNI?: ");
		if (Utils.validateDNI(DNI) == true){return;}
		String address = Interface.getString("Direccion?: ");
		String birthdate = Interface.getString("Fecha de nacimiento?: ");
		String role = Interface.getString("Rol?: ");

		// GUARDANDO LOS DATOS EN EL TXT
		String newUser ="\n" + username +
				"#" + password +
				"#" + name +
				"#" + email +
				"#" + DNI +
				"#" + address+
				"#" + birthdate +
				"#" + role;
		boolean result = writeUser(newUser);
		if (result) {
			System.out.println("Usuario registrado correctamente!");
		} else {
			System.err.println("error occurred.");
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
		System.out.println("Correo electronico: " + user.email);
		System.out.println("NIF: " + user.DNI);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate);
		System.out.println("Rol de usuario: " + user.role);

		Interface.toContinue();
	}
	public void logout() // Cerrar sesion y establecer propiedades de usuario
	{
		logged = false;
		user = new User();
	}

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
		user.email = currentUser[3];
		user.DNI = currentUser[4];
		user.address = currentUser[5];
		user.birthdate = currentUser[6];
		user.role = currentUser[7];
	}
}
/**ArrayList<String> users = readUsersFile(); // PASO 2
 for (int i = 0; i < users.size(); i++) { // PASO 3
 String[] currentUser = users.get(i).split("#");
 if (username.equalsIgnoreCase(currentUser[0])) {
 System.out.print("\nEl usuario ya existe\n");
 return;
 }
 public User getUser() // Devuelve el estado actual del usuario
 {
 return user;
 }
 * LOGIN clase 1 - pedir usuario 2 - pedir password 3 - leer users.txt 4 -
 * validar user y password 5A - correcto=loggedtrue//guardar en constructor user
 * los datos 5B - incorrecto=loggedfalse// mensaje de error+fin de login
 * SIGNUP (REGISTRO)
 *
 * 1 - Pedir username 2 - Leer fichero users.txt 3 - Busca coincidencia de
 * username (COMPROBACION). 4A - Si hay coincidencias --> ("Usuario ya
 * existe")--> FIN 4B -Si NO hay coincidencias --> Pedir el resto de campos 5 -
 * Construimos la nueva linea 6 - Escribir la linea en users.txt 7 - FIN
 public void signupV2() {
 String newUser = "\n";
 for (int i = 0; i < Config.FIELDS.length; i++) {
 String aux = Interface.getString(Config.FIELDS[i] + ": ");
 if (i == 0 && checkUser(aux)) {
 System.out.print("\nEl usuario ya existe\n");
 return;
 }
 newUser += aux + "#";
 }
 newUser += "user";

 newUser += user;
 if (writeUser(newUser)) {
 System.out.print("\nUsuario Registrado correctamente");
 } else {
 System.out.print("\nHa ocurrido un error en el registro");
 }
 }
 */
