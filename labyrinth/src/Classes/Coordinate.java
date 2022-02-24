/**
 * Coordinate.java.
 * Clase que
 * DMS/OAGS - 2021/22
 * version v1.0.0
 */

package Classes;

public class Coordinate
{
	public int i;
	public int j;
	public int direction;
	private boolean loaded;

	public Coordinate()
	{
		loaded = false;
	}

	public static void coordinateMenu()
	{
		System.out.println(Config.MENUFINDPATH);
		for (int i = 0; i < 3; i++)
		{
			int option = Interface.getInt("Selecciona opcion: ");
			if (option < 0 || option >= 3)
			{
				System.err.println("Opcion introducida no valida");
				continue;
			}
			if (option == 0)
			{
				return;
			}
			else
			{
				if (option == 1)
				{
					//Primer camino encontrado
				}
				else
				{
					//Camino mas rapido
				}
			}
		}
	}
	/**
	 *   = 0 = Final
	 * ^ = 1 = Arriba = i-1
	 * v = 2 = Abajo = i+1
	 * < = 3 = Izquierda = j-1
	 * > = 4 = Derecha = j+1
	 *   = 5 = Sin Salida = eliminar del array lo contado hasta volver a donde te permita seguir
	 * */
}
