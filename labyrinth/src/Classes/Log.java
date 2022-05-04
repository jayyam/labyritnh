package Classes;

import java.io.FileWriter;
import java.io.IOException;

public class Log
{
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
