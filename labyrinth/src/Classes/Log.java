/**
 * Log.java.
 * Clase que registra los eventos del sistema
 * OAGS - 2021/22
 * version v1.2.0
 */
package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class Log
{
	// GUARDANDO LOS DATOS EN EL TXT
	/**
	 * String newLog ="\n" + username + "#" + password + "#" + name + "#" + email + "#" + DNI + "#" + address+ "#" + birthdate + "#" + role;
	 */

	private boolean writeLog(String actualog)
	{
		boolean success = false;
		try {
			FileWriter myWriter = new FileWriter(Config.LOGPATH + Config.LOGFILE, true);
			myWriter.write(actualog);
			myWriter.close();
			success = true;
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}
		return success;
	}
}

/**	ArrayList<String> users = readLog(); // PASO 2
 for (int i = 0; i < users.size(); i++)
 {// PASO 3
 String[] currentUser = users.get(i).split("#");
 if (username.equalsIgnoreCase(currentUser[0]))
 {
 System.out.print("\nEl usuario ya existe\n");
 return;
 }
 }
 public User getUser() // Devuelve el estado actual del usuario
 {
 return user;
 }

 /**
 boolean result = writeLog(actuaLog);
 if (result)
 {
 System.out.println("registrado correctamente!");
 }
 else
 {
 System.err.println("error occurred.");
 }
 */