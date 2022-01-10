package Classes;

/**
 * Config.java
 * Clase que contiene los menus
 * DMS/OAGS - 2021/22
 * version 0.1.0
 */

public class Config

{		public static final int MILISECONDS = 2000;
		
		public static final String VERSION =  "v0.2.0";
		public static final String FILEABSOLUTEPATH = "./assets/files";
		public static final String FILEPATH = "/root/IdeaProjects/labyrinth/labyrinth/src/assets/files/";
		
		public static final String USERSFILE = "users.txt";
		
		public static final String WELCOME = "Bienvenido al resolvedor de laberintos....descripcion que me guste";
		public static final String GOODBYE = "\nFin de Programa!";
		
		public static final String UNLOGGEDMENU = "\nMENU Unlogeado\n"
												+ "-------------------\n"
												+ "1- Iniciar Sesion\n"
											    + "2- Registro\n"
											    + "0- Salir\n";
		
		public static final String LOGGEDMENU   = "\nMENU LOGEADO\n\n"
												+ "-------------------\n"
												+ "1- Cargar Laberinto\n"
												+ "2- Ver laberinto\n"
												+ "3- Establecesr casilla de entrada y salida\n"
												+ "4- Buscar caminos\n"
												+ "5- Ver usuario actual\n"
												+ "6- Cerrar sesion\n"
												+ "0- Salir\n";

		public static final String[] FIELDS = new String[]{"Nombre de usuario?: ", "Contraseña?: ", "Nombre completo?: ", "Edad?: ", "DNI/NIF?: ", "Email?: ", "Direccion?: ", "Fecha de nacimiento?: "};

		public static final String LABIRYNTHPATH = "/root/IdeaProjects/labyrinth/labyrinth/src/assets/files/labirynth";


/**
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




