/**
 * Session.java.
 * Clase del sistema para resolver las sesiones
 * OAGS - 2021/22
 * version v1.0.0
 */

package Classes;

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

	public Session()// Constructor Session

	{
		logged = true;
	}

	public boolean isLogged() // Devuelve el estado actual de la sesion

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

		for (int i = 0; i < users.size(); i++) // Paso 3
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

	public void signupV1()

	{
		String username = Interface.getString("Nombre de usuario?: ");
		if (checkUser(username)) 
		{
			System.out.println("\nEl usuario "+username+" ya existe!");
			return;
		}

		/**ArrayList<String> users = readUsersFile(); // PASO 2
		for (int i = 0; i < users.size(); i++) { // PASO 3
			String[] currentUser = users.get(i).split("#");
			if (username.equalsIgnoreCase(currentUser[0])) {
				System.out.print("\nEl usuario ya existe\n");
				return;
			}*/
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


	  /** public void signupV2() {
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
