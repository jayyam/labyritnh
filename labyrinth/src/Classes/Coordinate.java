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

	private Coordinate getNextCell(Coordinate currentCoordinate)
	{
		Coordinate nextCoordinate= new Coordinate();
		nextCoordinate.i = currentCoordinate.i;
		nextCoordinate.j = currentCoordinate.j;
		nextCoordinate.direction = 0;

		if(currentCoordinate.direction == 1)
		{
			//if(map[i][j] == ' ')
				{
					//^ = 1 = Arriba = i-1
				}
		}
		else if(currentCoordinate.direction == 2)
		{
			//if(map[i][j] == ' ')
			{
				//v = 2 = Abajo = i+1
			}
		}
		else if(currentCoordinate.direction == 3)
		{
			//if(map[i][j] == ' ')
			{
				//< = 3 = Izquierda = j-1
			}
		}
		else if(currentCoordinate.direction == 4)
		{
			//if(map[i][j] == ' ')
			{
				//> = 4 = Derecha = j+1
			}
		}
		return nextCoordinate;
	}
/**
	 *   = 0 = Final
	 * ^ = 1 = Arriba = i-1
	 * v = 2 = Abajo = i+1
	 * < = 3 = Izquierda = j-1
	 * > = 4 = Derecha = j+1
	 *   = 5 = Sin Salida = eliminar del array lo contado hasta volver a donde te permita seguir
	 *	if(Coordinate nextCell = getNextCell(path.get(path.size()-1)));
	 *   Comprueba si nextCell es valida o no
 	*
	 * */
}
