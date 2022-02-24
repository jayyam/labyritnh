/**
 * Main.java.
 * Clase principal del sistema para resolver un laberinto
 * DMS/OAGS - 2021/22
 * version v1.0.0
 */

import Classes.Coordinate;

import java.io.IOException;

public class Main

{
	public static Classes.Session Session = new Classes.Session();//Objeto creado de la clase session
	public static Classes.Labyrinth Laby = new Classes.Labyrinth();//Objeto que se crea de la clase labyrinth


	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Version actual: " + Classes.Config.VERSION);
		System.out.println(Classes.Config.WELCOME);

		int option = -1;
		while (option != 0) {
			if (!Session.isLogged()) {
				option = Classes.Interface.getInt(Classes.Config.UNLOGGEDMENU); // LLamar a la clase config a la parte Unlogged
				unloggedAction(option);
			}

			if (Session.isLogged())

			{
				option = Classes.Interface.getInt(Classes.Config.LOGGEDMENU); // LLamar a la clase Config
				loggedAction(option);
			}
		}
		System.out.println(Classes.Config.GOODBYE);

	}

	private static void unloggedAction(int option) throws InterruptedException {
		switch (option)

		{
			case 1: {
				Session.Login();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}

			case 2: {
				Session.signupV1();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}

		}
	}

	private static void loggedAction(int option) throws InterruptedException, IOException {

		switch (option)

		{
			case 0: {
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 1: {
				Laby.loadLabyrinth();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 2: {
				Laby.showMap();
				Thread.sleep(Classes.Config.MILISECONDS+4000);
				break;
			}
			case 3: {
				Laby.setEntranceExit();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 4: {
				Coordinate.coordinateMenu();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 5: {
				Session.ShowUser();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 6: {
				System.out.println("\nLOGIN Cerrando Sesion\n");
				Session.logout();
				Thread.sleep(Classes.Config.MILISECONDS);// time de espera antes despues de cerrar sesion
				break;
			}
		}

	}

}