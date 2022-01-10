

/**
 * Main.java
 * Clase principal del sistema para resolver un laberinto
 * DMS/OAGS - 2021/22
 * version 0.2.0
 */

import Classes.Labyrinth;

public class Main

{
	public static Classes.Session Session = new Classes.Session();

	public static void main(String[] args) throws InterruptedException

	{
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
				Session.signupV2();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}

		}
	}

	private static void loggedAction(int option) throws InterruptedException

	{

		switch (option)

		{

			case 0: {

				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 1: {
				System.out.println("\nLOGIN PROXIMAMENTE\n");
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 2: {
				System.out.println("\nLOGIN PROXIMAMENTE\n");
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 3: {
				System.out.println("\nLOGIN PROXIMAMENTE\n");
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 4: {
				System.out.println("\nLOGIN PROXIMAMENTE\n");
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 5: {
				System.out.println("\nLOGIN PROXIMAMENTE\n");
				Session.ShowUser();
				Thread.sleep(Classes.Config.MILISECONDS);
				break;
			}
			case 6: {
				System.out.println("\nLOGIN Cerrando Sesion\n");
				Session.logout();
				Thread.sleep(Classes.Config.MILISECONDS);// time de espera antes despues de cerrrar sesion
				break;
			}
		}

	}

}