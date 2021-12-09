package src.Classes;

public class Config 

{		public static final int MILISECONDS = 2000;
		
		public static final String VERSION = "v0.1.0";
		public static final String FILEPATH = "/media/daw20-09/ventoy/cosas/PortaProyects/labirynth/src/assets/files";
		
		public static final String USERSFILE = "users.txt";
		
		public static final String WELCOME = "Bienvenido al resolvedor de laberintos";
		public static final String GOODBYE = "Fin de Programa!";
		
		public static final String UNLOGGEDMENU = "\nMENU Unlogeado\n"
												+ "-------------------\n"
												+ "1- Iniciar Sesion\n"
											    + "2- Registro\n"
											    + "0- Salir\n";
		
		public static final String LOGGEDMENU   = "\\nMENU LOGEADO\\n\"\n"
												+ "-------------------\n"
												+ "1- Cargar Laberinto\n"
												+ "2- Ver laberinto\n"
												+ "3- Establecesr casilla de entrada y salida\n"
												+ "4- Buscar caminos\n"
												+ "5- Ver usuario actual\n"
												+ "6- Cerrar sesion\n"
												+ "0- Salir\n";	
}

/**
 * LOGIN clase
 
 * 1 - pedir usuario
 * 2 - pedir password
 * 3 - leer users.txt
 * 4 - validar user y password
 * 5A - correcto=loggedtrue//guardar en constructor user los datos
 * 5B - incorrecto=loggedfalse// mensaje de error+fin de login
 
  
 * SIGNUP (REGISTRO)
 
 * 1 - Pedir username
 * 2 - Leer fichero users.txt
 * 3 - Busca coincidencia de username. Si hay coincidencias --> ("Usuario ya existe")
 * 4 - Pedir el resto de campos
 * 5 - Volver a leer users.txt
 * 6 - Construimos la nueva linea
 * 7 - Añadir nueva linea al final  de todas las lineas de usuario
 * 8 - Escribir todo en users.txt
 */


