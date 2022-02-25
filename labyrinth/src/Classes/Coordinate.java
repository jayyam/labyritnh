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
					//Metodo Primer camino encontrado
				}
				else
				{
					//Metodo Camino mas rapido
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
	private boolean findPath(direction) {
		// We have reached the end point, and solved the maze
		if (location.equals(maze.getEndCoords())) {
			System.out.println("Found path length: " + pathLength);
			maze.setMazeArray(mazeArray);
			return true;
		}

	 *   = 0 = Final
	 * ^ = 1 = Arriba = i-1
	 * v = 2 = Abajo = i+1
	 * < = 3 = Izquierda = j-1
	 * > = 4 = Derecha = j+1
	 *   = 5 = Sin Salida = eliminar del array lo contado hasta volver a donde te permita seguir
	 *	if(Coordinate nextCell = getNextCell(path.get(path.size()-1)));
	 *   Comprueba si nextCell es valida o no
     *
 *
 * Breadth-first search
 *
 *      queue.add(startNode)
 *
 * while not queue.isEmpty:
 *           node = queue.remove()
 *
 *     if node is solution:
 *         return
 *     else:
 *         queue.addAll(node.children)
 *
 * A couple of additional notes:
 *     The above algorithms are suitable for trees: mazes that don't have loops.
 *     If your mazes have loops then you'll need to make sure you don't revisit nodes you've already seen.
 *     In that case, you'll need to add logic to keep track of all the already visited nodes
 *     and avoid adding them onto the stack/queue a second time.
 *
 *     As written, these algorithms will find the target node
 *     but they don't remember the path that got them there.
	 * */

}
