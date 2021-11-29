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
		System.out.println("Version actual: " + Config.VERSION);
		System.out.println(Config.WELCOME);
		
		int option = -1;
		while(option !=0)
			{
				if(!Session.isLogged()) 
					{
						option = getOptionUnlogged();//LLamar a la clase interface
						unloggedAction(option);
					}
			}
		System.out.println("Ha iniciado sesion? ->  " + Session.isLogged());
		
		System.out.println(Config.GOODBYE);		
	}
	
	private static int unloggedMenu() 
	{
		int option = -1;
			
			
	}
	
	private static int getOptionUnlogged() 
	
	{
	int option = -1;
	do 
		{
			option=Interface.getInt(Config.UNLOGGEDMENU);
		}
	
	while (option < 0 || option > 2);
	return option;			
	
		
	}
	private static void unloggedOption(int option)
	
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
	private static void getOptionLogged(int option) 
	
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
		case 3:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
			}
		case 4:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
			}
		case 5:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
			}
		case 6:
			{
				System.out.println("\nLOGIN PROXIMAMENTE\n");
			}				
		}
	
	}





}