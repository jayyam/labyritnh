package Classes;

/**
 * Config.java
 * Clase que contiene los menus
 * OAGS - 2021/22
 * version 0.2.0
 */

public class Config

{		public static final int MILISECONDS = 2000;
		
		public static final String VERSION =  "v0.2.0";

		public static final String FILEABSOLUTEPATH = "./assets/files";
		public static final String FILEPATH = "/home/omarsantana/IdeaProjects/labyrinth/labyrinth/src/assets/files/users.txt";
		public static final String USERSFILE = "users.txt";

		public static final String LABIRYNTHPATH = "/home/omarsantana/IdeaProjects/labyrinth/labyrinth/src/assets/files/labirynth";

		public static final String WELCOME = "Bienvenidos al algoritmo para resolver laberintos.\nEste programa utiliza un pathfinder para resolver\nlaberintos almacenados o generados aleatoriamente.\n";
		public static final String GOODBYE = "\nFin de Programa!";
		
		public static final String UNLOGGEDMENU = "\nMENU DE INICIO\n"
												+ "-------------------\n"
												+ "1- Iniciar Sesion\n"
											    + "2- Registro\n"
											    + "0- Salir\n";
		
		public static final String LOGGEDMENU   = "\nOPCIONES DE PROGRAMA\n\n"
												+ "-------------------\n"
												+ "1- Cargar Laberinto\n"
												+ "2- Ver laberinto\n"
												+ "3- Establecer casilla de entrada y salida\n"
												+ "4- Buscar caminos\n"
												+ "5- Ver usuario actual\n"
												+ "6- Cerrar sesion\n"
												+ "0- Salir\n";

		public static final String[] FIELDS = new String[]{"Nombre de usuario?: ", "Contraseña?: ", "Nombre completo?: ", "Edad?: ", "DNI/NIF?: ", "Email?: ", "Direccion?: ", "Fecha de nacimiento?: "};

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




