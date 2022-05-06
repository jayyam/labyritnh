package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class Log
{
	// GUARDANDO LOS DATOS EN EL TXT
	/**String newUser ="\n" + username +
	 "#" + password +
	 "#" + name +
	 "#" + email +
	 "#" + DNI +
	 "#" + address+
	 "#" + birthdate +
	 "#" + role;
	 boolean result = writeLog(newLog);
	 if (result) {
	 System.out.println("registrado correctamente!");
	 } else {
	 System.err.println("error occurred.");
	 }*/

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
