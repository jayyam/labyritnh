package src;

/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2021.11.27
 * version 0.1.0
 */

import src.Classes.Config;
import src.Classes.Interface;
import src.Classes.Session;

public class Main 

{
	public static Session Session = new Session();
	public static void main(String[] args)
	
	{
		System.out.println("Version actual: "+ Config.VERSION);
		System.out.println(Config.WELCOME);
		
		int option = -1;
		while(option !=0)
			{
			do {
					if(!Session.isLogged()) 
					{
						option = Interface.getInt(Config.UNLOGGEDMENU); //LLamar a la clase config
						//UnloggedAction(option);
					}
				
					if(!Session.isLogged()) 
					
					{
						option = Interface.getInt(Config.LOGGEDMENU); //LLamar a la clase Config
						//LoggerdAction(option);
					}
			}
				while (option < 0 || option > 2);
				
			}
		System.out.println("Ha iniciado sesion? ->  " + Session.isLogged());
			
	}

	private static void unloggedOption(int option) throws InterruptedException
	
	{
		switch(option)
			
			{	
			case 1:
				{
					System.out.println("\nLOGIN PROXIMAMENTE\n");
				}
				
			case 2:
				{
					System.out.println("\nLOGIN PROXIMAMENTE\n");
				}
				
			}		
	}
	private static void getOptionLogged(int option) throws InterruptedException 
	
	{
	
		switch(option)
	
		{
		
		case 0:
		{
			
			Thread.sleep(Config.MILISECONDS);
			break;
		}
		case 1:
			{
					System.out.println("\nLOGIN PROXIMAMENTE\n");
					Thread.sleep(Config.MILISECONDS);
					break;
			}
		case 2:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
					Thread.sleep(Config.MILISECONDS);
					break;
			}	
		case 3:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
					Thread.sleep(Config.MILISECONDS);	
					break;
			}
		case 4:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
					Thread.sleep(Config.MILISECONDS);
					break;
			}
		case 5:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
					Session.ShowUser();
					Thread.sleep(Config.MILISECONDS);
					break;
			}
		case 6:
			{
				System.out.println("\nLOGIN Cerrando Sesion\n");
					Session.logout();
					Thread.sleep(Config.MILISECONDS);//time de espera antes despues de cerrrar sesion
					break;
			}				
		}
	
	}





}