/**
 * Interface.java.
 * Clase dada por el profesor
 * OAGS - 2021/22
 * version 0.2.0.
 */
package Classes;

import java.util.Scanner;

public class Interface
{
	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	
	{
		
		
	}

	// Sin enunciado
	public static int getInt() 
	{
		int number = -1;
		String value = keyboard.nextLine();
		try {
				number = Integer.parseInt(value);
			}
		
		catch (Exception e)
			{
			// keyboard.next();
			}
		return number;
	}

	// Con enunciado
	public static int getInt(String text) 
	{
		int number = -1;
		System.out.print(text);
		String value = keyboard.nextLine();
		try {
			number = Integer.parseInt(value);
		} catch (Exception e) {
			System.out.println("El valor introducido no es un numero");
			// keyboard.next();
		}
		return number;
	}

	// Sin enunciado
	public static String getString() 
	{
		String value = keyboard.nextLine().trim();
		return value;
	}

	// Con enunciado
	public static String getString(String text) 
	{
		System.out.print(text);
		String value = keyboard.nextLine().trim();
		return value;
	}
	
	/** Metodo para que pida una accion para continuar
	public static void toContinue() 
	{
		System.out.print("\nIntroduzca cualquier tecla para continuar ");
		keyboard.next();
	}
*/

	// Metodo para que pida una accion para continuar
	// Version 2.0
	public static void toContinue() {
		System.out.print("\nPulse 'enter' para continuar");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}